package mx.gluo.management.evaluationservice.utils;

import mx.gluo.management.evaluationservice.model.Concepto;

import java.util.List;

public class ConceptoUtils {

    private static final int LEADER_COLUMN = 5;
    private static final int SELF_COLUMN = 6;
    private static final int AVG_COLUMN = 7;

    public static void setValuesInConcepto(Concepto concepto, List<Object> row){
        concepto.setEvaluacionLider(row.get(LEADER_COLUMN).toString());
        concepto.setAutoevaluacion(row.get(SELF_COLUMN).toString());
        concepto.setPromedio(row.get(AVG_COLUMN).toString());
    }
}
