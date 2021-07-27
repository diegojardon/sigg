package mx.gluo.management.evaluationservice.service;

import mx.gluo.management.evaluationservice.enums.ProfileTypes;
import mx.gluo.management.evaluationservice.model.Evaluation;
import mx.gluo.management.evaluationservice.model.SpreadSheetInfo;
import mx.gluo.management.evaluationservice.utils.GoogleSheetUtils;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Date;
import java.util.concurrent.CompletableFuture;

@Service
public class EvaluationsService {

    public Evaluation getEvaluationsByUser(){

        //CONSULTAR DE BD LA URL DEL DOCUMENTO DE GOOGLE SHEETS

        String googleSheetId = "1CuI25Svp4Uy-8u7Gr-n0HN70D6l6lz3APhwRXA2F3t0";

        //LEER LOS DATOS DE LAS DIFERENTES HOJAS

        Evaluation evaluation = new Evaluation();

        CompletableFuture<Integer> basicEvaluationFuture = CompletableFuture.supplyAsync(() ->{

            SpreadSheetInfo spreadSheetInfoBasic = new SpreadSheetInfo();
            spreadSheetInfoBasic.setSpreadsheetId(googleSheetId);

            GoogleSheetUtils.getSpreadsheetRangeByUserJob(spreadSheetInfoBasic, ProfileTypes.BASIC.getValue());
            try {
                GoogleSheetUtils.getEvaluationByUserJob(evaluation, spreadSheetInfoBasic);
            } catch (IOException | GeneralSecurityException e) {
                e.printStackTrace();
            }

            return 0;
        });

        CompletableFuture<Integer> devBackEvaluationFuture = CompletableFuture.supplyAsync(() -> {

            SpreadSheetInfo spreadSheetInfoDevBack = new SpreadSheetInfo();
            spreadSheetInfoDevBack.setSpreadsheetId(googleSheetId);

            GoogleSheetUtils.getSpreadsheetRangeByUserJob(spreadSheetInfoDevBack, ProfileTypes.DEV_BACK_END.getValue());
            try{
                GoogleSheetUtils.getEvaluationByUserJob(evaluation, spreadSheetInfoDevBack);
            } catch (IOException | GeneralSecurityException e) {
                e.printStackTrace();
            }

            return 0;
        });

        CompletableFuture<Integer> devFrontEvaluationFuture = CompletableFuture.supplyAsync(() -> {

            SpreadSheetInfo spreadSheetInfoDevFront = new SpreadSheetInfo();
            spreadSheetInfoDevFront.setSpreadsheetId(googleSheetId);

            GoogleSheetUtils.getSpreadsheetRangeByUserJob(spreadSheetInfoDevFront, ProfileTypes.DEV_FRONT_END.getValue());
            try{
                GoogleSheetUtils.getEvaluationByUserJob(evaluation, spreadSheetInfoDevFront);
            } catch (IOException | GeneralSecurityException e) {
                e.printStackTrace();
            }

            return 0;
        });

        CompletableFuture<Integer> techLeadEvaluationFuture = CompletableFuture.supplyAsync(() -> {

            SpreadSheetInfo spreadSheetInfoTechLead = new SpreadSheetInfo();
            spreadSheetInfoTechLead.setSpreadsheetId(googleSheetId);

            GoogleSheetUtils.getSpreadsheetRangeByUserJob(spreadSheetInfoTechLead, ProfileTypes.TECH_LEAD.getValue());
            try{
                GoogleSheetUtils.getEvaluationByUserJob(evaluation, spreadSheetInfoTechLead);
            } catch (IOException | GeneralSecurityException e) {
                e.printStackTrace();
            }

            return 0;
        });

        CompletableFuture.allOf(basicEvaluationFuture, devBackEvaluationFuture, devFrontEvaluationFuture, techLeadEvaluationFuture).join();

        return evaluation;
    }

}
