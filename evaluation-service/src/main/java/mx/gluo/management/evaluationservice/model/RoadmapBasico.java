package mx.gluo.management.evaluationservice.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RoadmapBasico {

    private String internetYRedesLider;
    private String unixYLinuxLider;
    private String cvsLider;
    private String buenasPracticasLider;
    private String seguridadLider;
    private String patronesDisenioLider;
    private String ciYcdLider;

    private String internetYRedesAuto;
    private String unixYLinuxAuto;
    private String cvsAuto;
    private String buenasPracticasAuto;
    private String seguridadAuto;
    private String patronesDisenioAuto;
    private String ciYcdAuto;

    private String internetYRedesAvg;
    private String unixYLinuxAvg;
    private String cvsAvg;
    private String buenasPracticasAvg;
    private String seguridadAvg;
    private String patronesDisenioAvg;
    private String ciYcdAvg;

    private Ingles ingles;

    private Softskills softskills;

    private Promedio promedioBasico;
}
