package mx.gluo.management.evaluationservice.mapper;

import mx.gluo.management.evaluationservice.enums.RoadmapBasicoLabels;
import mx.gluo.management.evaluationservice.enums.RoadmapDevBackLabels;
import mx.gluo.management.evaluationservice.model.Concepto;
import mx.gluo.management.evaluationservice.model.Promedio;
import mx.gluo.management.evaluationservice.model.RoadmapDevBackEnd;
import mx.gluo.management.evaluationservice.utils.ConceptoUtils;

import java.util.List;

public class RoadmapDevBackMapper {

    private static final int LEADER_AVG = 0;
    private static final int SELF_AVG = 1;
    private static final int TOTAL_AVG = 0;

    public static void setJava(List<Concepto> conceptoList, List<Object> row){
        Concepto concepto = new Concepto();
        concepto.setLabel(RoadmapDevBackLabels.JAVA.getText());
        ConceptoUtils.setValuesInConcepto(concepto, row);
        conceptoList.add(concepto);
    }

    public static void setSpring(List<Concepto> conceptoList, List<Object> row){
        Concepto concepto = new Concepto();
        concepto.setLabel(RoadmapDevBackLabels.SPRING.getText());
        ConceptoUtils.setValuesInConcepto(concepto, row);
        conceptoList.add(concepto);
    }

    public static void setSpringCloud(List<Concepto> conceptoList, List<Object> row){
        Concepto concepto = new Concepto();
        concepto.setLabel(RoadmapDevBackLabels.SPRING_CLOUD.getText());
        ConceptoUtils.setValuesInConcepto(concepto, row);
        conceptoList.add(concepto);
    }

    public static void setFrontEnd(List<Concepto> conceptoList, List<Object> row){
        Concepto concepto = new Concepto();
        concepto.setLabel(RoadmapDevBackLabels.FRONT_END.getText());
        ConceptoUtils.setValuesInConcepto(concepto, row);
        conceptoList.add(concepto);
    }

    public static void setBaseDeDatos(List<Concepto> conceptoList, List<Object> row){
        Concepto concepto = new Concepto();
        concepto.setLabel(RoadmapDevBackLabels.BD.getText());
        ConceptoUtils.setValuesInConcepto(concepto, row);
        conceptoList.add(concepto);
    }

    public static void setWebServices(List<Concepto> conceptoList, List<Object> row){
        Concepto concepto = new Concepto();
        concepto.setLabel(RoadmapDevBackLabels.WEB_SERVICES.getText());
        ConceptoUtils.setValuesInConcepto(concepto, row);
        conceptoList.add(concepto);
    }

    public static void setCICD(List<Concepto> conceptoList, List<Object> row){
        Concepto concepto = new Concepto();
        concepto.setLabel(RoadmapDevBackLabels.CI_CD.getText());
        ConceptoUtils.setValuesInConcepto(concepto, row);
        conceptoList.add(concepto);
    }

    public static void setSeguridad(List<Concepto> conceptoList, List<Object> row){
        Concepto concepto = new Concepto();
        concepto.setLabel(RoadmapDevBackLabels.SEGURIDAD.getText());
        ConceptoUtils.setValuesInConcepto(concepto, row);
        conceptoList.add(concepto);
    }

    public static void setAnalisisNegocio(List<Concepto> conceptoList, List<Object> row){
        Concepto concepto = new Concepto();
        concepto.setLabel(RoadmapDevBackLabels.ANALISIS_NEGOCIO.getText());
        ConceptoUtils.setValuesInConcepto(concepto, row);
        conceptoList.add(concepto);
    }

    public static void setAverage(Promedio promedio, List<Object> row){
        promedio.setPromedioLider(row.get(LEADER_AVG).toString());
        promedio.setPromedioAuto(row.get(SELF_AVG).toString());
    }

    public static void setAvgTotal(Promedio promedio, List<Object> row){
        promedio.setPromedioGeneral(row.get(TOTAL_AVG).toString());
    }
}
