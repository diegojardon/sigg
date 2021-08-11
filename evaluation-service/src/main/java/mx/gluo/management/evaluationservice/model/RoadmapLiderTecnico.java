package mx.gluo.management.evaluationservice.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import mx.gluo.management.evaluationservice.model.Promedio;

import java.util.List;

@Data
@NoArgsConstructor
public class RoadmapLiderTecnico {

    private List<ConceptoLT> conceptoLtList;
    private Promedio promedioLiderTecnico;
}
