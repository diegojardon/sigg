package mx.gluo.management.evaluationservice.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Softskills {

    private String comunicacionEfectivaLider;
    private String trabajoEquipoLider;
    private String responsabilidadLider;
    private String proactividadLider;

    private String comunicacionEfectivaAuto;
    private String trabajoEquipoAuto;
    private String responsabilidadAuto;
    private String proactividadAuto;

    private String comunicacionEfectivaAvg;
    private String trabajoEquipoAvg;
    private String responsabilidadAvg;
    private String proactividadAvg;
}
