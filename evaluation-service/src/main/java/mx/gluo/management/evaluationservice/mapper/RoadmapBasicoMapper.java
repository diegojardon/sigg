package mx.gluo.management.evaluationservice.mapper;

import mx.gluo.management.evaluationservice.enums.RoadmapBasicoLabels;
import mx.gluo.management.evaluationservice.model.Concepto;
import mx.gluo.management.evaluationservice.model.Promedio;
import mx.gluo.management.evaluationservice.model.RoadmapBasico;
import mx.gluo.management.evaluationservice.utils.ConceptoUtils;

import java.util.List;

public class RoadmapBasicoMapper {

    private static final int LEADER_AVG = 0;
    private static final int SELF_AVG = 1;
    private static final int TOTAL_AVG = 0;

    public static void setInternetYRedes(List<Concepto> conceptoList, List<Object> row){
        Concepto concepto = new Concepto();
        concepto.setLabel(RoadmapBasicoLabels.INTERNET_Y_REDES.getText());
        ConceptoUtils.setValuesInConcepto(concepto, row);
        conceptoList.add(concepto);
    }

    public static void setUnixYLinux(List<Concepto> conceptoList, List<Object> row){
        Concepto concepto = new Concepto();
        concepto.setLabel(RoadmapBasicoLabels.UNIX_Y_LINUX.getText());
        ConceptoUtils.setValuesInConcepto(concepto, row);
        conceptoList.add(concepto);
    }

    public static void setCvs(List<Concepto> conceptoList, List<Object> row){
        Concepto concepto = new Concepto();
        concepto.setLabel(RoadmapBasicoLabels.CVS.getText());
        ConceptoUtils.setValuesInConcepto(concepto, row);
        conceptoList.add(concepto);
    }

    public static void setBuenasPracticas(List<Concepto> conceptoList, List<Object> row){
        Concepto concepto = new Concepto();
        concepto.setLabel(RoadmapBasicoLabels.BUENAS_PRACTICAS.getText());
        ConceptoUtils.setValuesInConcepto(concepto, row);
        conceptoList.add(concepto);
    }

    public static void setSeguridad(List<Concepto> conceptoList, List<Object> row){
        Concepto concepto = new Concepto();
        concepto.setLabel(RoadmapBasicoLabels.SEGURIDAD.getText());
        ConceptoUtils.setValuesInConcepto(concepto, row);
        conceptoList.add(concepto);
    }

    public static void setPatronesDisenio(List<Concepto> conceptoList, List<Object> row){
        Concepto concepto = new Concepto();
        concepto.setLabel(RoadmapBasicoLabels.PATRONES_DISENIO.getText());
        ConceptoUtils.setValuesInConcepto(concepto, row);
        conceptoList.add(concepto);
    }

    public static void setCICD(List<Concepto> conceptoList, List<Object> row){
        Concepto concepto = new Concepto();
        concepto.setLabel(RoadmapBasicoLabels.CI_CD.getText());
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