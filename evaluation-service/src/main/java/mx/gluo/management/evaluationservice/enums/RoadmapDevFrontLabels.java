package mx.gluo.management.evaluationservice.enums;

public enum RoadmapDevFrontLabels {

    HTML(1, "HTML"),
    CSS(2, "CSS"),
    JAVASCRIPT(3, "Javascript"),
    VIRTUAL_DOM(4, "Virtual DOM"),
    SEGURIDAD(5, "Seguridad"),
    CI_CD(6, "CI/CD"),
    ARQUITECTURA_WEB(7, "Arquitectura Web");

    private int value;
    private String text;

    RoadmapDevFrontLabels(int value, String text) {
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
