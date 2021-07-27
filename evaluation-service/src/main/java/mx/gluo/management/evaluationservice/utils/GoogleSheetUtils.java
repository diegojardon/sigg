package mx.gluo.management.evaluationservice.utils;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.SheetsScopes;
import com.google.api.services.sheets.v4.model.ValueRange;
import mx.gluo.management.evaluationservice.enums.ProfileTypes;
import mx.gluo.management.evaluationservice.model.Evaluation;
import mx.gluo.management.evaluationservice.model.SpreadSheetInfo;
import mx.gluo.management.evaluationservice.service.EvaluationsService;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.List;

public class GoogleSheetUtils {

    private static final String APPLICATION_NAME = "Google Sheets API Java Quickstart";
    private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
    private static final String TOKENS_DIRECTORY_PATH = "tokens";

    private static final List<String> SCOPES = Collections.singletonList(SheetsScopes.SPREADSHEETS_READONLY);
    private static final String CREDENTIALS_FILE_PATH = "/credentials.json";

    public static void getSpreadsheetRangeByUserJob(SpreadSheetInfo spreadSheetInfo, int profileTypeValue){

        switch(profileTypeValue){
            case 1:
                spreadSheetInfo.setRange(ProfileTypes.BASIC.getText() + "!E1:L112");
                spreadSheetInfo.setProfileType(ProfileTypes.BASIC.getValue());
                break;
            case 2:
                spreadSheetInfo.setRange(ProfileTypes.DEV_BACK_END.getText() + "!F1:M233");
                spreadSheetInfo.setProfileType(ProfileTypes.DEV_BACK_END.getValue());
                break;
            case 3:
                spreadSheetInfo.setRange(ProfileTypes.DEV_FRONT_END.getText() + "!E1:L136");
                spreadSheetInfo.setProfileType(ProfileTypes.DEV_FRONT_END.getValue());
                break;
            case 4:
                spreadSheetInfo.setRange(ProfileTypes.TECH_LEAD.getText() + "!D1:K71");
                spreadSheetInfo.setProfileType(ProfileTypes.TECH_LEAD.getValue());
                break;
            default:
                spreadSheetInfo.setRange("");
                spreadSheetInfo.setProfileType(-1);
                break;
        }
    }

    public static void getEvaluationByUserJob(Evaluation evaluation, SpreadSheetInfo spreadSheetInfo)
            throws IOException, GeneralSecurityException {

        final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
        Sheets service = new Sheets.Builder(HTTP_TRANSPORT, JSON_FACTORY, getCredentials(HTTP_TRANSPORT))
                .setApplicationName(APPLICATION_NAME)
                .build();

        ValueRange response = service.spreadsheets().values()
                .get(spreadSheetInfo.getSpreadsheetId(), spreadSheetInfo.getRange())
                .execute();

        List<List<Object>> values = response.getValues();
        if (values == null || values.isEmpty()) {
            System.out.println("No data found.");
        } else {
            GoogleSheetDataMapper.getEvaluationData(values, evaluation, spreadSheetInfo.getProfileType());
        }
    }

    private static Credential getCredentials(final NetHttpTransport HTTP_TRANSPORT) throws IOException {
        // Load client secrets.
        InputStream in = EvaluationsService.class.getResourceAsStream(CREDENTIALS_FILE_PATH);
        if (in == null) {
            throw new FileNotFoundException("Resource not found: " + CREDENTIALS_FILE_PATH);
        }
        GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY, new InputStreamReader(in));

        GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(
                HTTP_TRANSPORT, JSON_FACTORY, clientSecrets, SCOPES)
                .setDataStoreFactory(new FileDataStoreFactory(new java.io.File(TOKENS_DIRECTORY_PATH)))
                .setAccessType("offline")
                .build();
        LocalServerReceiver receiver = new LocalServerReceiver.Builder().setPort(8888).build();
        return new AuthorizationCodeInstalledApp(flow, receiver).authorize("user");
    }

}
