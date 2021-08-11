package mx.gluo.management.evaluationservice.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Concepto {

    private String label;
    private String evaluacionLider;
    private String autoevaluacion;
    private String promedio;

}
