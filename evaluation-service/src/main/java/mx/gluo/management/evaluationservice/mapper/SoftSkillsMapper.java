package mx.gluo.management.evaluationservice.mapper;

import mx.gluo.management.evaluationservice.model.RoadmapBasico;
import mx.gluo.management.evaluationservice.model.Softskills;

import java.util.List;

public class SoftSkillsMapper {

    private static final int LEADER_COLUMN = 5;
    private static final int SELF_COLUMN = 6;
    private static final int AVG_COLUMN = 7;

    public static void setComunicacion(Softskills softskills, List<Object> row){
        softskills.setComunicacionEfectivaLider(row.get(LEADER_COLUMN).toString());
        softskills.setComunicacionEfectivaAuto(row.get(SELF_COLUMN).toString());
        softskills.setComunicacionEfectivaAvg(row.get(AVG_COLUMN).toString());
    }

    public static void setTrabajoEquipo(Softskills softskills, List<Object> row){
        softskills.setTrabajoEquipoLider(row.get(LEADER_COLUMN).toString());
        softskills.setTrabajoEquipoAuto(row.get(SELF_COLUMN).toString());
        softskills.setTrabajoEquipoAvg(row.get(AVG_COLUMN).toString());
    }

    public static void setResponsabilidad(Softskills softskills, List<Object> row){
        softskills.setResponsabilidadLider(row.get(LEADER_COLUMN).toString());
        softskills.setResponsabilidadAuto(row.get(SELF_COLUMN).toString());
        softskills.setResponsabilidadAvg(row.get(AVG_COLUMN).toString());
    }

    public static void setProactividad(Softskills softskills, List<Object> row){
        softskills.setProactividadLider(row.get(LEADER_COLUMN).toString());
        softskills.setProactividadAuto(row.get(SELF_COLUMN).toString());
        softskills.setProactividadAvg(row.get(AVG_COLUMN).toString());
    }
}
