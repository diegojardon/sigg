package mx.gluo.management.evaluationservice.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RoadmapDevBackEnd {

    private String javaLider;
    private String springLider;
    private String springCloudLider;
    private String frontEndLider;
    private String baseDatosLider;
    private String webServicesLider;
    private String ciYcdLider;
    private String seguridadLider;
    private String analisisNegocioLider;

    private String javaAuto;
    private String springAuto;
    private String springCloudAuto;
    private String frontEndAuto;
    private String baseDatosAuto;
    private String webServicesAuto;
    private String ciYcdAuto;
    private String seguridadAuto;
    private String analisisNegocioAuto;

    private String javaAvg;
    private String springAvg;
    private String springCloudAvg;
    private String frontEndAvg;
    private String baseDatosAvg;
    private String webServicesAvg;
    private String ciYcdAvg;
    private String seguridadAvg;
    private String analisisNegocioAvg;

    private Promedio promedioDevBack;
}
