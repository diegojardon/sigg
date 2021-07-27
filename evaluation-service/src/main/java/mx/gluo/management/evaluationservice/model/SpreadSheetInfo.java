package mx.gluo.management.evaluationservice.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SpreadSheetInfo {

    private String spreadsheetId;
    private String range;
    private int profileType;
}
