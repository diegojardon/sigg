package mx.gluo.management.evaluationservice.utils;

import mx.gluo.management.evaluationservice.model.Promedio;
import mx.gluo.management.evaluationservice.model.RoadmapBasico;

import java.util.List;

public class RoadmapBasicoMapper {

    private static final int LEADER_COLUMN = 5;
    private static final int SELF_COLUMN = 6;
    private static final int AVG_COLUMN = 7;
    private static final int LEADER_AVG = 0;
    private static final int SELF_AVG = 1;
    private static final int TOTAL_AVG = 0;

    public static void setInternetYRedes(RoadmapBasico roadmapBasico, List<Object> row){
        roadmapBasico.setInternetYRedesLider(row.get(LEADER_COLUMN).toString());
        roadmapBasico.setInternetYRedesAuto(row.get(SELF_COLUMN).toString());
        roadmapBasico.setInternetYRedesAvg(row.get(AVG_COLUMN).toString());
    }

    public static void setUnixYLinux(RoadmapBasico roadmapBasico, List<Object> row){
        roadmapBasico.setUnixYLinuxLider(row.get(LEADER_COLUMN).toString());
        roadmapBasico.setUnixYLinuxAuto(row.get(SELF_COLUMN).toString());
        roadmapBasico.setUnixYLinuxAvg(row.get(AVG_COLUMN).toString());
    }

    public static void setCvs(RoadmapBasico roadmapBasico, List<Object> row){
        roadmapBasico.setCvsLider(row.get(LEADER_COLUMN).toString());
        roadmapBasico.setCvsAuto(row.get(SELF_COLUMN).toString());
        roadmapBasico.setCvsAvg(row.get(AVG_COLUMN).toString());
    }

    public static void setBuenasPracticas(RoadmapBasico roadmapBasico, List<Object> row){
        roadmapBasico.setBuenasPracticasLider(row.get(LEADER_COLUMN).toString());
        roadmapBasico.setBuenasPracticasAuto(row.get(SELF_COLUMN).toString());
        roadmapBasico.setBuenasPracticasAvg(row.get(AVG_COLUMN).toString());
    }

    public static void setSeguridad(RoadmapBasico roadmapBasico, List<Object> row){
        roadmapBasico.setSeguridadLider(row.get(LEADER_COLUMN).toString());
        roadmapBasico.setSeguridadAuto(row.get(SELF_COLUMN).toString());
        roadmapBasico.setSeguridadAvg(row.get(AVG_COLUMN).toString());
    }

    public static void setPatronesDisenio(RoadmapBasico roadmapBasico, List<Object> row){
        roadmapBasico.setPatronesDisenioLider(row.get(LEADER_COLUMN).toString());
        roadmapBasico.setPatronesDisenioAuto(row.get(SELF_COLUMN).toString());
        roadmapBasico.setPatronesDisenioAvg(row.get(AVG_COLUMN).toString());
    }

    public static void setCICD(RoadmapBasico roadmapBasico, List<Object> row){
        roadmapBasico.setCiYcdLider(row.get(LEADER_COLUMN).toString());
        roadmapBasico.setCiYcdAuto(row.get(SELF_COLUMN).toString());
        roadmapBasico.setCiYcdAvg(row.get(AVG_COLUMN).toString());
    }

    public static void setIngles(RoadmapBasico roadmapBasico, List<Object> row){

    }

    public static void setSoftSkills(RoadmapBasico roadmapBasico, List<Object> row){

    }

    public static void setAverage(Promedio promedio, List<Object> row){
        promedio.setPromedioLider(row.get(LEADER_AVG).toString());
        promedio.setPromedioAuto(row.get(SELF_AVG).toString());
    }

    public static void setAvgTotal(Promedio promedio, List<Object> row){
        promedio.setPromedioGeneral(row.get(TOTAL_AVG).toString());
    }
}
