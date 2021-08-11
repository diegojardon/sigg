package mx.gluo.management.evaluationservice.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import mx.gluo.management.evaluationservice.model.Ingles;
import mx.gluo.management.evaluationservice.model.Promedio;
import mx.gluo.management.evaluationservice.model.Softskills;

import java.util.List;

@Data
@NoArgsConstructor
public class RoadmapBasico {

    private List<Concepto> conceptoList;
    private Ingles ingles;
    private Softskills softskills;
    private Promedio promedioBasico;
}
