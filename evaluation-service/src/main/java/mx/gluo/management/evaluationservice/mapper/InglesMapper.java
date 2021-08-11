package mx.gluo.management.evaluationservice.mapper;

import mx.gluo.management.evaluationservice.enums.InglesLabels;
import mx.gluo.management.evaluationservice.model.Concepto;
import mx.gluo.management.evaluationservice.model.Ingles;
import mx.gluo.management.evaluationservice.utils.ConceptoUtils;

import java.util.List;

public class InglesMapper {

    public static void setSpeaking(List<Concepto> conceptoInglesList, List<Object> row){
        Concepto concepto = new Concepto();
        concepto.setLabel(InglesLabels.SPEAKING.getText());
        ConceptoUtils.setValuesInConcepto(concepto, row);
        conceptoInglesList.add(concepto);
    }

    public static void setListening(List<Concepto> conceptoInglesList, List<Object> row){
        Concepto concepto = new Concepto();
        concepto.setLabel(InglesLabels.LISTENING.getText());
        ConceptoUtils.setValuesInConcepto(concepto, row);
        conceptoInglesList.add(concepto);
    }

    public static void setReading(List<Concepto> conceptoInglesList, List<Object> row){
        Concepto concepto = new Concepto();
        concepto.setLabel(InglesLabels.READING.getText());
        ConceptoUtils.setValuesInConcepto(concepto, row);
        conceptoInglesList.add(concepto);
    }
}
