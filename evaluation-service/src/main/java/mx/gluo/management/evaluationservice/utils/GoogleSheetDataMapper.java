package mx.gluo.management.evaluationservice.utils;

import mx.gluo.management.evaluationservice.mapper.*;
import mx.gluo.management.evaluationservice.model.*;
import mx.gluo.management.evaluationservice.model.RoadmapBasico;
import mx.gluo.management.evaluationservice.model.RoadmapDevBackEnd;
import mx.gluo.management.evaluationservice.model.RoadmapDevFrontEnd;
import mx.gluo.management.evaluationservice.model.RoadmapLiderTecnico;

import java.util.ArrayList;
import java.util.List;

public class GoogleSheetDataMapper {

    public static void getEvaluationData(List<List<Object>> values, Evaluation evaluation, int profileTypeValue){

        switch(profileTypeValue){
            case 1:
                getBasicEvaluationData(values, evaluation);
                break;
            case 2:
                getDevBackEndEvaluationData(values, evaluation);
                break;
            case 3:
                getDevFrontEndEvaluationData(values, evaluation);
                break;
            case 4:
                getTechLeadEvaluationData(values, evaluation);
                break;
            default:
                break;
        }

    }

    private static void getBasicEvaluationData(List<List<Object>> values, Evaluation evaluation){

        RoadmapBasico roadmapBasico = new RoadmapBasico();
        List<Concepto> conceptoList = new ArrayList<>();

        Ingles ingles = new Ingles();
        List<Concepto> conceptoInglesList = new ArrayList<>();

        Softskills softskills = new Softskills();
        List<Concepto> conceptoSoftSkillsList = new ArrayList<>();

        Promedio promedio = new Promedio();

        short rowNumber = 1;

        for(List row : values.subList(1, 15)) {
            switch(rowNumber){
                case 1:
                    RoadmapBasicoMapper.setInternetYRedes(conceptoList, row);
                    break;
                case 2:
                    RoadmapBasicoMapper.setUnixYLinux(conceptoList, row);
                    break;
                case 3:
                    RoadmapBasicoMapper.setCvs(conceptoList, row);
                    break;
                case 4:
                    RoadmapBasicoMapper.setBuenasPracticas(conceptoList, row);
                    break;
                case 5:
                    RoadmapBasicoMapper.setSeguridad(conceptoList, row);
                    break;
                case 6:
                    RoadmapBasicoMapper.setPatronesDisenio(conceptoList, row);
                    break;
                case 7:
                    RoadmapBasicoMapper.setCICD(conceptoList, row);
                    break;
                case 8:
                    InglesMapper.setSpeaking(conceptoInglesList, row);
                    break;
                case 9:
                    InglesMapper.setListening(conceptoInglesList, row);
                    break;
                case 10:
                    InglesMapper.setReading(conceptoInglesList, row);
                    break;
                case 11:
                    SoftSkillsMapper.setComunicacion(conceptoSoftSkillsList, row);
                    break;
                case 12:
                    SoftSkillsMapper.setTrabajoEquipo(conceptoSoftSkillsList, row);
                    break;
                case 13:
                    SoftSkillsMapper.setResponsabilidad(conceptoSoftSkillsList, row);
                    break;
                case 14:
                    SoftSkillsMapper.setProactividad(conceptoSoftSkillsList, row);
                    break;
                default:
                    break;
            }
            rowNumber++;
        }

        ingles.setConceptoList(conceptoInglesList);
        softskills.setConceptoList(conceptoSoftSkillsList);

        roadmapBasico.setConceptoList(conceptoList);
        roadmapBasico.setIngles(ingles);
        roadmapBasico.setSoftskills(softskills);

        List<Object> row = values.get(109);
        RoadmapBasicoMapper.setAverage(promedio, row);
        row = values.get(111);
        RoadmapBasicoMapper.setAvgTotal(promedio, row);
        roadmapBasico.setPromedioBasico(promedio);

        evaluation.setRoadmapBasico(roadmapBasico);
    }

    private static void getDevBackEndEvaluationData(List<List<Object>> values, Evaluation evaluation){

        RoadmapDevBackEnd roadmapDevBackEnd = new RoadmapDevBackEnd();

        List<Concepto> conceptoList = new ArrayList<>();
        Promedio promedio = new Promedio();

        short rowNumber = 1;

        for(List row : values.subList(1, 10)) {
            switch(rowNumber){
                case 1:
                    RoadmapDevBackMapper.setJava(conceptoList, row);
                    break;
                case 2:
                    RoadmapDevBackMapper.setSpring(conceptoList, row);
                    break;
                case 3:
                    RoadmapDevBackMapper.setSpringCloud(conceptoList, row);
                    break;
                case 4:
                    RoadmapDevBackMapper.setFrontEnd(conceptoList, row);
                    break;
                case 5:
                    RoadmapDevBackMapper.setBaseDeDatos(conceptoList, row);
                    break;
                case 6:
                    RoadmapDevBackMapper.setWebServices(conceptoList, row);
                    break;
                case 7:
                    RoadmapDevBackMapper.setCICD(conceptoList, row);
                    break;
                case 8:
                    RoadmapDevBackMapper.setSeguridad(conceptoList, row);
                    break;
                case 9:
                    RoadmapDevBackMapper.setAnalisisNegocio(conceptoList, row);
                    break;
                default:
                    break;
            }
            rowNumber++;
        }

        roadmapDevBackEnd.setConceptoList(conceptoList);

        List<Object> row = values.get(230);
        RoadmapDevBackMapper.setAverage(promedio, row);
        row = values.get(232);
        RoadmapDevBackMapper.setAvgTotal(promedio, row);
        roadmapDevBackEnd.setPromedioDevBack(promedio);

        evaluation.setRoadmapDevBackEnd(roadmapDevBackEnd);

    }

    private static void getDevFrontEndEvaluationData(List<List<Object>> values, Evaluation evaluation){

        RoadmapDevFrontEnd roadmapDevFrontEnd = new RoadmapDevFrontEnd();

        List<Concepto> conceptoList = new ArrayList<>();
        Promedio promedio = new Promedio();

        short rowNumber = 1;

        for(List row : values.subList(1, 8)) {
            switch(rowNumber){
                case 1:
                    RoadmapDevFrontMapper.setHtml(conceptoList, row);
                    break;
                case 2:
                    RoadmapDevFrontMapper.setCss(conceptoList, row);
                    break;
                case 3:
                    RoadmapDevFrontMapper.setJavascript(conceptoList, row);
                    break;
                case 4:
                    RoadmapDevFrontMapper.setVirtualDom(conceptoList, row);
                    break;
                case 5:
                    RoadmapDevFrontMapper.setSeguridad(conceptoList, row);
                    break;
                case 6:
                    RoadmapDevFrontMapper.setCICD(conceptoList, row);
                    break;
                case 7:
                    RoadmapDevFrontMapper.setArquitecturaWeb(conceptoList, row);
                    break;
                default:
                    break;
            }
            rowNumber++;
        }

        roadmapDevFrontEnd.setConceptoList(conceptoList);

        List<Object> row = values.get(133);
        RoadmapDevFrontMapper.setAverage(promedio, row);
        row = values.get(135);
        RoadmapDevFrontMapper.setAvgTotal(promedio, row);
        roadmapDevFrontEnd.setPromedioDevFront(promedio);

        evaluation.setRoadmapDevFrontEnd(roadmapDevFrontEnd);
    }

    private static void getTechLeadEvaluationData(List<List<Object>> values, Evaluation evaluation){

        RoadmapLiderTecnico roadmapLiderTecnico = new RoadmapLiderTecnico();

        List<ConceptoLT> conceptoLtList = new ArrayList<>();
        Promedio promedio = new Promedio();

        short rowNumber = 1;

        for(List row : values.subList(1, 6)) {
            switch(rowNumber){
                case 1:
                    RoadmapLiderTecnicoMapper.setAnalistaNegocio(conceptoLtList, row);
                    break;
                case 2:
                    RoadmapLiderTecnicoMapper.setPlanificador(conceptoLtList, row);
                    break;
                case 3:
                    RoadmapLiderTecnicoMapper.setDesarrollador(conceptoLtList, row);
                    break;
                case 4:
                    RoadmapLiderTecnicoMapper.setLiderEquipo(conceptoLtList, row);
                    break;
                case 5:
                    RoadmapLiderTecnicoMapper.setArquitecto(conceptoLtList, row);
                    break;
                default:
                    break;
            }
            rowNumber++;
        }

        roadmapLiderTecnico.setConceptoLtList(conceptoLtList);

        List<Object> row = values.get(68);
        RoadmapLiderTecnicoMapper.setAverage(promedio, row);
        row = values.get(70);
        RoadmapLiderTecnicoMapper.setAvgTotal(promedio, row);
        roadmapLiderTecnico.setPromedioLiderTecnico(promedio);

        evaluation.setRoadmapLiderTecnico(roadmapLiderTecnico);
    }

}
