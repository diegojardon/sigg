package mx.gluo.management.evaluationservice.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import mx.gluo.management.evaluationservice.model.Promedio;

import java.util.List;

@Data
@NoArgsConstructor
public class RoadmapDevFrontEnd {

    private List<Concepto> conceptoList;
    private Promedio promedioDevFront;
}
