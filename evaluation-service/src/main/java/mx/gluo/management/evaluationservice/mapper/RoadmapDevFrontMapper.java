package mx.gluo.management.evaluationservice.mapper;

import mx.gluo.management.evaluationservice.enums.RoadmapBasicoLabels;
import mx.gluo.management.evaluationservice.enums.RoadmapDevFrontLabels;
import mx.gluo.management.evaluationservice.model.Concepto;
import mx.gluo.management.evaluationservice.model.Promedio;
import mx.gluo.management.evaluationservice.model.RoadmapDevFrontEnd;
import mx.gluo.management.evaluationservice.utils.ConceptoUtils;

import java.util.List;

public class RoadmapDevFrontMapper {

    private static final int LEADER_AVG = 0;
    private static final int SELF_AVG = 1;
    private static final int TOTAL_AVG = 0;

    public static void setHtml(List<Concepto> conceptoList, List<Object> row){
        Concepto concepto = new Concepto();
        concepto.setLabel(RoadmapDevFrontLabels.HTML.getText());
        ConceptoUtils.setValuesInConcepto(concepto, row);
        conceptoList.add(concepto);
    }

    public static void setCss(List<Concepto> conceptoList, List<Object> row){
        Concepto concepto = new Concepto();
        concepto.setLabel(RoadmapDevFrontLabels.CSS.getText());
        ConceptoUtils.setValuesInConcepto(concepto, row);
        conceptoList.add(concepto);
    }

    public static void setJavascript(List<Concepto> conceptoList, List<Object> row){
        Concepto concepto = new Concepto();
        concepto.setLabel(RoadmapDevFrontLabels.JAVASCRIPT.getText());
        ConceptoUtils.setValuesInConcepto(concepto, row);
        conceptoList.add(concepto);
    }

    public static void setVirtualDom(List<Concepto> conceptoList, List<Object> row){
        Concepto concepto = new Concepto();
        concepto.setLabel(RoadmapDevFrontLabels.VIRTUAL_DOM.getText());
        ConceptoUtils.setValuesInConcepto(concepto, row);
        conceptoList.add(concepto);
    }

    public static void setSeguridad(List<Concepto> conceptoList, List<Object> row){
        Concepto concepto = new Concepto();
        concepto.setLabel(RoadmapDevFrontLabels.SEGURIDAD.getText());
        ConceptoUtils.setValuesInConcepto(concepto, row);
        conceptoList.add(concepto);
    }

    public static void setCICD(List<Concepto> conceptoList, List<Object> row){
        Concepto concepto = new Concepto();
        concepto.setLabel(RoadmapDevFrontLabels.CI_CD.getText());
        ConceptoUtils.setValuesInConcepto(concepto, row);
        conceptoList.add(concepto);
    }

    public static void setArquitecturaWeb(List<Concepto> conceptoList, List<Object> row){
        Concepto concepto = new Concepto();
        concepto.setLabel(RoadmapDevFrontLabels.ARQUITECTURA_WEB.getText());
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
