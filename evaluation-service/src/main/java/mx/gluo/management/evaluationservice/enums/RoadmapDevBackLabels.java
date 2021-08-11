package mx.gluo.management.evaluationservice.enums;

public enum RoadmapDevBackLabels {

    JAVA(1, "Java"),
    SPRING(2, "Spring"),
    SPRING_CLOUD(3, "Spring Cloud"),
    FRONT_END(4, "Front End"),
    BD(5, "BD"),
    WEB_SERVICES(6, "Web Services"),
    CI_CD(7, "CI/CD"),
    SEGURIDAD(8, "Seguridad"),
    ANALISIS_NEGOCIO(9, "Análisis Negocio");

    private int value;
    private String text;

    RoadmapDevBackLabels(int value, String text) {
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
