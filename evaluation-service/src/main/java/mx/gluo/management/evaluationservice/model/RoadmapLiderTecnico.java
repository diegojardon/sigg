package mx.gluo.management.evaluationservice.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RoadmapLiderTecnico {

    private String analistaNegocio;
    private String planificador;
    private String desarrollador;
    private String liderEquipo;
    private String arquitecto;

    private Promedio promedioLiderTecnico;

}
