package mx.gluo.management.evaluationservice.mapper;

import mx.gluo.management.evaluationservice.model.Promedio;
import mx.gluo.management.evaluationservice.model.RoadmapDevBackEnd;

import java.util.List;

public class RoadmapDevBackMapper {

    private static final int LEADER_COLUMN = 5;
    private static final int SELF_COLUMN = 6;
    private static final int AVG_COLUMN = 7;
    private static final int LEADER_AVG = 0;
    private static final int SELF_AVG = 1;
    private static final int TOTAL_AVG = 0;

    public static void setJava(RoadmapDevBackEnd roadmapDevBackEnd, List<Object> row){
        roadmapDevBackEnd.setJavaLider(row.get(LEADER_COLUMN).toString());
        roadmapDevBackEnd.setJavaAuto(row.get(SELF_COLUMN).toString());
        roadmapDevBackEnd.setJavaAvg(row.get(AVG_COLUMN).toString());
    }

    public static void setSpring(RoadmapDevBackEnd roadmapDevBackEnd, List<Object> row){
        roadmapDevBackEnd.setSpringLider(row.get(LEADER_COLUMN).toString());
        roadmapDevBackEnd.setSpringAuto(row.get(SELF_COLUMN).toString());
        roadmapDevBackEnd.setSpringAvg(row.get(AVG_COLUMN).toString());
    }

    public static void setSpringCloud(RoadmapDevBackEnd roadmapDevBackEnd, List<Object> row){
        roadmapDevBackEnd.setSpringCloudLider(row.get(LEADER_COLUMN).toString());
        roadmapDevBackEnd.setSpringCloudAuto(row.get(SELF_COLUMN).toString());
        roadmapDevBackEnd.setSpringCloudAvg(row.get(AVG_COLUMN).toString());
    }

    public static void setFrontEnd(RoadmapDevBackEnd roadmapDevBackEnd, List<Object> row){
        roadmapDevBackEnd.setFrontEndLider(row.get(LEADER_COLUMN).toString());
        roadmapDevBackEnd.setFrontEndAuto(row.get(SELF_COLUMN).toString());
        roadmapDevBackEnd.setFrontEndAvg(row.get(AVG_COLUMN).toString());
    }

    public static void setBaseDeDatos(RoadmapDevBackEnd roadmapDevBackEnd, List<Object> row){
        roadmapDevBackEnd.setBaseDatosLider(row.get(LEADER_COLUMN).toString());
        roadmapDevBackEnd.setBaseDatosAuto(row.get(SELF_COLUMN).toString());
        roadmapDevBackEnd.setBaseDatosAvg(row.get(AVG_COLUMN).toString());
    }

    public static void setWebServices(RoadmapDevBackEnd roadmapDevBackEnd, List<Object> row){
        roadmapDevBackEnd.setWebServicesLider(row.get(LEADER_COLUMN).toString());
        roadmapDevBackEnd.setWebServicesAuto(row.get(SELF_COLUMN).toString());
        roadmapDevBackEnd.setWebServicesAvg(row.get(AVG_COLUMN).toString());
    }

    public static void setCICD(RoadmapDevBackEnd roadmapDevBackEnd, List<Object> row){
        roadmapDevBackEnd.setCiYcdLider(row.get(LEADER_COLUMN).toString());
        roadmapDevBackEnd.setCiYcdAuto(row.get(SELF_COLUMN).toString());
        roadmapDevBackEnd.setCiYcdAvg(row.get(AVG_COLUMN).toString());
    }

    public static void setSeguridad(RoadmapDevBackEnd roadmapDevBackEnd, List<Object> row){
        roadmapDevBackEnd.setSeguridadLider(row.get(LEADER_COLUMN).toString());
        roadmapDevBackEnd.setSeguridadAuto(row.get(SELF_COLUMN).toString());
        roadmapDevBackEnd.setSeguridadAvg(row.get(AVG_COLUMN).toString());
    }

    public static void setAnalisisNegocio(RoadmapDevBackEnd roadmapDevBackEnd, List<Object> row){
        roadmapDevBackEnd.setAnalisisNegocioLider(row.get(LEADER_COLUMN).toString());
        roadmapDevBackEnd.setAnalisisNegocioAuto(row.get(SELF_COLUMN).toString());
        roadmapDevBackEnd.setAnalisisNegocioAvg(row.get(AVG_COLUMN).toString());
    }

    public static void setAverage(Promedio promedio, List<Object> row){
        promedio.setPromedioLider(row.get(LEADER_AVG).toString());
        promedio.setPromedioAuto(row.get(SELF_AVG).toString());
    }

    public static void setAvgTotal(Promedio promedio, List<Object> row){
        promedio.setPromedioGeneral(row.get(TOTAL_AVG).toString());
    }
}
