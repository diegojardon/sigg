package mx.gluo.management.evaluationservice.mapper;

import mx.gluo.management.evaluationservice.enums.SoftSkillsLabels;
import mx.gluo.management.evaluationservice.model.Concepto;
import mx.gluo.management.evaluationservice.model.Softskills;
import mx.gluo.management.evaluationservice.utils.ConceptoUtils;

import java.util.List;

public class SoftSkillsMapper {

    public static void setComunicacion(List<Concepto> conceptoSoftSkillsList, List<Object> row){
        Concepto concepto = new Concepto();
        concepto.setLabel(SoftSkillsLabels.COMUNICACION.getText());
        ConceptoUtils.setValuesInConcepto(concepto, row);
        conceptoSoftSkillsList.add(concepto);
    }

    public static void setTrabajoEquipo(List<Concepto> conceptoSoftSkillsList, List<Object> row){
        Concepto concepto = new Concepto();
        concepto.setLabel(SoftSkillsLabels.TRABAJO_EQUIPO.getText());
        ConceptoUtils.setValuesInConcepto(concepto, row);
        conceptoSoftSkillsList.add(concepto);
    }

    public static void setResponsabilidad(List<Concepto> conceptoSoftSkillsList, List<Object> row){
        Concepto concepto = new Concepto();
        concepto.setLabel(SoftSkillsLabels.RESPONSABILIDAD.getText());
        ConceptoUtils.setValuesInConcepto(concepto, row);
        conceptoSoftSkillsList.add(concepto);
    }

    public static void setProactividad(List<Concepto> conceptoSoftSkillsList, List<Object> row){
        Concepto concepto = new Concepto();
        concepto.setLabel(SoftSkillsLabels.PROACTIVIDAD.getText());
        ConceptoUtils.setValuesInConcepto(concepto, row);
        conceptoSoftSkillsList.add(concepto);
    }
}
