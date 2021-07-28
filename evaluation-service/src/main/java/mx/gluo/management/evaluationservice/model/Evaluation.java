package mx.gluo.management.evaluationservice.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Evaluation {

    private String googleSheetId;
    private String completeName;
    private RoadmapBasico roadmapBasico;
    private RoadmapDevBackEnd roadmapDevBackEnd;
    private RoadmapDevFrontEnd roadmapDevFrontEnd;
    private RoadmapLiderTecnico roadmapLiderTecnico;

}
