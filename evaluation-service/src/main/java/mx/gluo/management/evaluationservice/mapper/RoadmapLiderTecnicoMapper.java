package mx.gluo.management.evaluationservice.mapper;

import mx.gluo.management.evaluationservice.model.Promedio;
import mx.gluo.management.evaluationservice.model.RoadmapBasico;
import mx.gluo.management.evaluationservice.model.RoadmapLiderTecnico;

import java.util.List;

public class RoadmapLiderTecnicoMapper {

    private static final int LEADER_COLUMN = 5;
    private static final int SELF_COLUMN = 6;
    private static final int AVG_COLUMN = 7;
    private static final int LEADER_AVG = 0;
    private static final int SELF_AVG = 1;
    private static final int TOTAL_AVG = 0;

    public static void setAnalistaNegocio(RoadmapLiderTecnico roadmapLiderTecnico, List<Object> row){
        roadmapLiderTecnico.setAnalistaNegocio(row.get(SELF_COLUMN).toString());
    }

    public static void setPlanificador(RoadmapLiderTecnico roadmapLiderTecnico, List<Object> row){
        roadmapLiderTecnico.setPlanificador(row.get(SELF_COLUMN).toString());
    }

    public static void setDesarrollador(RoadmapLiderTecnico roadmapLiderTecnico, List<Object> row){
        roadmapLiderTecnico.setDesarrollador(row.get(SELF_COLUMN).toString());
    }

    public static void setLiderEquipo(RoadmapLiderTecnico roadmapLiderTecnico, List<Object> row){
        roadmapLiderTecnico.setLiderEquipo(row.get(SELF_COLUMN).toString());
    }

    public static void setArquitecto(RoadmapLiderTecnico roadmapLiderTecnico, List<Object> row){
        roadmapLiderTecnico.setArquitecto(row.get(SELF_COLUMN).toString());
    }

    public static void setAverage(Promedio promedio, List<Object> row){
        promedio.setPromedioLider(row.get(LEADER_AVG).toString());
        promedio.setPromedioAuto(row.get(SELF_AVG).toString());
    }

    public static void setAvgTotal(Promedio promedio, List<Object> row){
        promedio.setPromedioGeneral(row.get(TOTAL_AVG).toString());
    }
}
