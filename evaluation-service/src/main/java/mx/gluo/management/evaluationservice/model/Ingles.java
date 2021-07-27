package mx.gluo.management.evaluationservice.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Ingles {

    private String speakingLider;
    private String listeningLider;
    private String readingLider;

    private String speakingAuto;
    private String listeningAuto;
    private String readingAuto;

    private String speakingAvg;
    private String listeningAvg;
    private String readingAvg;
}
