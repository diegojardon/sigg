package mx.gluo.management.evaluationservice.utils;

import mx.gluo.management.evaluationservice.mapper.*;
import mx.gluo.management.evaluationservice.model.*;

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
        Ingles ingles = new Ingles();
        Softskills softskills = new Softskills();
        Promedio promedio = new Promedio();

        short rowNumber = 1;

        for(List row : values.subList(1, 15)) {
            switch(rowNumber){
                case 1:
                    RoadmapBasicoMapper.setInternetYRedes(roadmapBasico, row);
                    break;
                case 2:
                    RoadmapBasicoMapper.setUnixYLinux(roadmapBasico, row);
                    break;
                case 3:
                    RoadmapBasicoMapper.setCvs(roadmapBasico, row);
                    break;
                case 4:
                    RoadmapBasicoMapper.setBuenasPracticas(roadmapBasico, row);
                    break;
                case 5:
                    RoadmapBasicoMapper.setSeguridad(roadmapBasico, row);
                    break;
                case 6:
                    RoadmapBasicoMapper.setPatronesDisenio(roadmapBasico, row);
                    break;
                case 7:
                    RoadmapBasicoMapper.setCICD(roadmapBasico, row);
                    break;
                case 8:
                    InglesMapper.setSpeaking(ingles, row);
                    break;
                case 9:
                    InglesMapper.setListening(ingles, row);
                    break;
                case 10:
                    InglesMapper.setReading(ingles, row);
                    break;
                case 11:
                    SoftSkillsMapper.setComunicacion(softskills, row);
                    break;
                case 12:
                    SoftSkillsMapper.setTrabajoEquipo(softskills, row);
                    break;
                case 13:
                    SoftSkillsMapper.setResponsabilidad(softskills, row);
                    break;
                case 14:
                    SoftSkillsMapper.setProactividad(softskills, row);
                    break;
                default:
                    break;
            }
            rowNumber++;
        }

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
        Promedio promedio = new Promedio();

        short rowNumber = 1;

        for(List row : values.subList(1, 10)) {
            switch(rowNumber){
                case 1:
                    RoadmapDevBackMapper.setJava(roadmapDevBackEnd, row);
                    break;
                case 2:
                    RoadmapDevBackMapper.setSpring(roadmapDevBackEnd, row);
                    break;
                case 3:
                    RoadmapDevBackMapper.setSpringCloud(roadmapDevBackEnd, row);
                    break;
                case 4:
                    RoadmapDevBackMapper.setFrontEnd(roadmapDevBackEnd, row);
                    break;
                case 5:
                    RoadmapDevBackMapper.setBaseDeDatos(roadmapDevBackEnd, row);
                    break;
                case 6:
                    RoadmapDevBackMapper.setWebServices(roadmapDevBackEnd, row);
                    break;
                case 7:
                    RoadmapDevBackMapper.setCICD(roadmapDevBackEnd, row);
                    break;
                case 8:
                    RoadmapDevBackMapper.setSeguridad(roadmapDevBackEnd, row);
                    break;
                case 9:
                    RoadmapDevBackMapper.setAnalisisNegocio(roadmapDevBackEnd, row);
                    break;
                default:
                    break;
            }
            rowNumber++;
        }

        List<Object> row = values.get(230);
        RoadmapDevBackMapper.setAverage(promedio, row);
        row = values.get(232);
        RoadmapDevBackMapper.setAvgTotal(promedio, row);
        roadmapDevBackEnd.setPromedioDevBack(promedio);

        evaluation.setRoadmapDevBackEnd(roadmapDevBackEnd);

    }

    private static void getDevFrontEndEvaluationData(List<List<Object>> values, Evaluation evaluation){

        RoadmapDevFrontEnd roadmapDevFrontEnd = new RoadmapDevFrontEnd();
        Promedio promedio = new Promedio();

        short rowNumber = 1;

        for(List row : values.subList(1, 8)) {
            switch(rowNumber){
                case 1:
                    RoadmapDevFrontMapper.setHtml(roadmapDevFrontEnd, row);
                    break;
                case 2:
                    RoadmapDevFrontMapper.setCss(roadmapDevFrontEnd, row);
                    break;
                case 3:
                    RoadmapDevFrontMapper.setJavascript(roadmapDevFrontEnd, row);
                    break;
                case 4:
                    RoadmapDevFrontMapper.setVirtualDom(roadmapDevFrontEnd, row);
                    break;
                case 5:
                    RoadmapDevFrontMapper.setSeguridad(roadmapDevFrontEnd, row);
                    break;
                case 6:
                    RoadmapDevFrontMapper.setCICD(roadmapDevFrontEnd, row);
                    break;
                case 7:
                    RoadmapDevFrontMapper.setArquitecturaWeb(roadmapDevFrontEnd, row);
                    break;
                default:
                    break;
            }
            rowNumber++;
        }


        List<Object> row = values.get(133);
        RoadmapDevFrontMapper.setAverage(promedio, row);
        row = values.get(135);
        RoadmapDevFrontMapper.setAvgTotal(promedio, row);
        roadmapDevFrontEnd.setPromedioDevFront(promedio);

        evaluation.setRoadmapDevFrontEnd(roadmapDevFrontEnd);
    }

    private static void getTechLeadEvaluationData(List<List<Object>> values, Evaluation evaluation){

        RoadmapLiderTecnico roadmapLiderTecnico = new RoadmapLiderTecnico();
        Promedio promedio = new Promedio();

        short rowNumber = 1;

        for(List row : values.subList(1, 6)) {
            switch(rowNumber){
                case 1:
                    RoadmapLiderTecnicoMapper.setAnalistaNegocio(roadmapLiderTecnico, row);
                    break;
                case 2:
                    RoadmapLiderTecnicoMapper.setPlanificador(roadmapLiderTecnico, row);
                    break;
                case 3:
                    RoadmapLiderTecnicoMapper.setDesarrollador(roadmapLiderTecnico, row);
                    break;
                case 4:
                    RoadmapLiderTecnicoMapper.setLiderEquipo(roadmapLiderTecnico, row);
                    break;
                case 5:
                    RoadmapLiderTecnicoMapper.setArquitecto(roadmapLiderTecnico, row);
                    break;
                default:
                    break;
            }
            rowNumber++;
        }

        List<Object> row = values.get(68);
        RoadmapLiderTecnicoMapper.setAverage(promedio, row);
        row = values.get(70);
        RoadmapLiderTecnicoMapper.setAvgTotal(promedio, row);
        roadmapLiderTecnico.setPromedioLiderTecnico(promedio);

        evaluation.setRoadmapLiderTecnico(roadmapLiderTecnico);
    }

}
