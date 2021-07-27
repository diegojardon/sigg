package mx.gluo.management.evaluationservice.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RoadmapDevFrontEnd {

    private String htmlLider;
    private String cssLider;
    private String javascriptLider;
    private String virtualDomLider;
    private String seguridadLider;
    private String ciYcdLider;
    private String arquitecturaWebLider;

    private String htmlAuto;
    private String cssAuto;
    private String javascriptAuto;
    private String virtualDomAuto;
    private String seguridadAuto;
    private String ciYcdAuto;
    private String arquitecturaWebAuto;

    private String htmlAvg;
    private String cssAvg;
    private String javascriptAvg;
    private String virtualDomAvg;
    private String seguridadAvg;
    private String ciYcdAvg;
    private String arquitecturaWebAvg;

    private Promedio promedioDevFront;
}
