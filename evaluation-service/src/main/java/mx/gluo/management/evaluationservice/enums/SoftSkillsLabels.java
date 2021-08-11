package mx.gluo.management.evaluationservice.enums;

public enum SoftSkillsLabels {

    COMUNICACION(1, "Comunicación"),
    TRABAJO_EQUIPO(2, "Trabajo en Equipo"),
    RESPONSABILIDAD(3, "Responsabilidad"),
    PROACTIVIDAD(4, "Proactividad");

    private int value;
    private String text;

    SoftSkillsLabels(int value, String text) {
        this.value = value;
        this.text = text;
    }

    public int getValue() {
        return this.value;
    }

    public String getText() {
        return this.text;
    }
}
