package mx.gluo.management.evaluationservice.enums;

public enum RoadmapBasicoLabels {

    INTERNET_Y_REDES(1, "Internet y Redes"),
    UNIX_Y_LINUX(2, "Unix y Linux"),
    CVS(3, "CVS"),
    BUENAS_PRACTICAS(4, "Buenas Prácticas"),
    SEGURIDAD(5, "Seguridad"),
    PATRONES_DISENIO(6, "Patrones de Diseño"),
    CI_CD(7, "CI/CD");

    private int value;
    private String text;

    RoadmapBasicoLabels(int value, String text) {
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
