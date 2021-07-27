package mx.gluo.management.evaluationservice.mapper;

import mx.gluo.management.evaluationservice.model.Ingles;
import mx.gluo.management.evaluationservice.model.RoadmapBasico;

import java.util.List;

public class InglesMapper {

    private static final int LEADER_COLUMN = 5;
    private static final int SELF_COLUMN = 6;
    private static final int AVG_COLUMN = 7;

    public static void setSpeaking(Ingles ingles, List<Object> row){
        ingles.setSpeakingLider(row.get(LEADER_COLUMN).toString());
        ingles.setSpeakingAuto(row.get(SELF_COLUMN).toString());
        ingles.setSpeakingAvg(row.get(AVG_COLUMN).toString());
    }

    public static void setListening(Ingles ingles, List<Object> row){
        ingles.setListeningLider(row.get(LEADER_COLUMN).toString());
        ingles.setListeningAuto(row.get(SELF_COLUMN).toString());
        ingles.setListeningAvg(row.get(AVG_COLUMN).toString());
    }

    public static void setReading(Ingles ingles, List<Object> row){
        ingles.setReadingLider(row.get(LEADER_COLUMN).toString());
        ingles.setReadingAuto(row.get(SELF_COLUMN).toString());
        ingles.setReadingAvg(row.get(AVG_COLUMN).toString());
    }
}
