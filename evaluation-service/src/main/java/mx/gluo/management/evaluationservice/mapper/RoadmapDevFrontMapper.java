package mx.gluo.management.evaluationservice.mapper;

import mx.gluo.management.evaluationservice.model.Promedio;
import mx.gluo.management.evaluationservice.model.RoadmapDevFrontEnd;

import java.util.List;

public class RoadmapDevFrontMapper {

    private static final int LEADER_COLUMN = 5;
    private static final int SELF_COLUMN = 6;
    private static final int AVG_COLUMN = 7;
    private static final int LEADER_AVG = 0;
    private static final int SELF_AVG = 1;
    private static final int TOTAL_AVG = 0;

    public static void setHtml(RoadmapDevFrontEnd roadmapDevFrontEnd, List<Object> row){
        roadmapDevFrontEnd.setHtmlLider(row.get(LEADER_COLUMN).toString());
        roadmapDevFrontEnd.setHtmlAuto(row.get(SELF_COLUMN).toString());
        roadmapDevFrontEnd.setHtmlAvg(row.get(AVG_COLUMN).toString());
    }

    public static void setCss(RoadmapDevFrontEnd roadmapDevFrontEnd, List<Object> row){
        roadmapDevFrontEnd.setCssLider(row.get(LEADER_COLUMN).toString());
        roadmapDevFrontEnd.setCssAuto(row.get(SELF_COLUMN).toString());
        roadmapDevFrontEnd.setCssAvg(row.get(AVG_COLUMN).toString());
    }

    public static void setJavascript(RoadmapDevFrontEnd roadmapDevFrontEnd, List<Object> row){
        roadmapDevFrontEnd.setJavascriptLider(row.get(LEADER_COLUMN).toString());
        roadmapDevFrontEnd.setJavascriptAuto(row.get(SELF_COLUMN).toString());
        roadmapDevFrontEnd.setJavascriptAvg(row.get(AVG_COLUMN).toString());
    }

    public static void setVirtualDom(RoadmapDevFrontEnd roadmapDevFrontEnd, List<Object> row){
        roadmapDevFrontEnd.setVirtualDomLider(row.get(LEADER_COLUMN).toString());
        roadmapDevFrontEnd.setVirtualDomAuto(row.get(SELF_COLUMN).toString());
        roadmapDevFrontEnd.setVirtualDomAvg(row.get(AVG_COLUMN).toString());
    }

    public static void setSeguridad(RoadmapDevFrontEnd roadmapDevFrontEnd, List<Object> row){
        roadmapDevFrontEnd.setSeguridadLider(row.get(LEADER_COLUMN).toString());
        roadmapDevFrontEnd.setSeguridadAuto(row.get(SELF_COLUMN).toString());
        roadmapDevFrontEnd.setSeguridadAvg(row.get(AVG_COLUMN).toString());
    }

    public static void setCICD(RoadmapDevFrontEnd roadmapDevFrontEnd, List<Object> row){
        roadmapDevFrontEnd.setCiYcdLider(row.get(LEADER_COLUMN).toString());
        roadmapDevFrontEnd.setCiYcdAuto(row.get(SELF_COLUMN).toString());
        roadmapDevFrontEnd.setCiYcdAvg(row.get(AVG_COLUMN).toString());
    }

    public static void setArquitecturaWeb(RoadmapDevFrontEnd roadmapDevFrontEnd, List<Object> row){
        roadmapDevFrontEnd.setArquitecturaWebLider(row.get(LEADER_COLUMN).toString());
        roadmapDevFrontEnd.setArquitecturaWebAuto(row.get(SELF_COLUMN).toString());
        roadmapDevFrontEnd.setArquitecturaWebAvg(row.get(AVG_COLUMN).toString());
    }

    public static void setAverage(Promedio promedio, List<Object> row){
        promedio.setPromedioLider(row.get(LEADER_AVG).toString());
        promedio.setPromedioAuto(row.get(SELF_AVG).toString());
    }

    public static void setAvgTotal(Promedio promedio, List<Object> row){
        promedio.setPromedioGeneral(row.get(TOTAL_AVG).toString());
    }
}
