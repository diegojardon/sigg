package mx.gluo.management.evaluationservice.mapper;

import mx.gluo.management.evaluationservice.enums.LTLabels;
import mx.gluo.management.evaluationservice.model.Concepto;
import mx.gluo.management.evaluationservice.model.ConceptoLT;
import mx.gluo.management.evaluationservice.model.Promedio;
import mx.gluo.management.evaluationservice.model.RoadmapLiderTecnico;

import java.util.List;

public class RoadmapLiderTecnicoMapper {

    private static final int LEADER_COLUMN = 5;
    private static final int SELF_COLUMN = 6;
    private static final int AVG_COLUMN = 7;
    private static final int LEADER_AVG = 0;
    private static final int SELF_AVG = 1;
    private static final int TOTAL_AVG = 0;

    public static void setAnalistaNegocio(List<ConceptoLT> conceptoLtList, List<Object> row){
        ConceptoLT conceptoLT = new ConceptoLT();
        conceptoLT.setLabel(LTLabels.ANALISTA_NEGOCIO.getText());
        conceptoLT.setAutoevaluacion(row.get(SELF_COLUMN).toString());
        conceptoLtList.add(conceptoLT);
    }

    public static void setPlanificador(List<ConceptoLT> conceptoLtList, List<Object> row){
        ConceptoLT conceptoLT = new ConceptoLT();
        conceptoLT.setLabel(LTLabels.PLANIFICADOR.getText());
        conceptoLT.setAutoevaluacion(row.get(SELF_COLUMN).toString());
        conceptoLtList.add(conceptoLT);
    }

    public static void setDesarrollador(List<ConceptoLT> conceptoLtList, List<Object> row){
        ConceptoLT conceptoLT = new ConceptoLT();
        conceptoLT.setLabel(LTLabels.DESARROLLADOR.getText());
        conceptoLT.setAutoevaluacion(row.get(SELF_COLUMN).toString());
        conceptoLtList.add(conceptoLT);
    }

    public static void setLiderEquipo(List<ConceptoLT> conceptoLtList, List<Object> row){
        ConceptoLT conceptoLT = new ConceptoLT();
        conceptoLT.setLabel(LTLabels.LIDER_EQUIPO.getText());
        conceptoLT.setAutoevaluacion(row.get(SELF_COLUMN).toString());
        conceptoLtList.add(conceptoLT);
    }

    public static void setArquitecto(List<ConceptoLT> conceptoLtList, List<Object> row){
        ConceptoLT conceptoLT = new ConceptoLT();
        conceptoLT.setLabel(LTLabels.ARQUITECTO.getText());
        conceptoLT.setAutoevaluacion(row.get(SELF_COLUMN).toString());
        conceptoLtList.add(conceptoLT);
    }

    public static void setAverage(Promedio promedio, List<Object> row){
        promedio.setPromedioLider(row.get(LEADER_AVG).toString());
        promedio.setPromedioAuto(row.get(SELF_AVG).toString());
    }

    public static void setAvgTotal(Promedio promedio, List<Object> row){
        promedio.setPromedioGeneral(row.get(TOTAL_AVG).toString());
    }
}
