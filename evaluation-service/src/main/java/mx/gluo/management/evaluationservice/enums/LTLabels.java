package mx.gluo.management.evaluationservice.enums;

public enum LTLabels {

    ANALISTA_NEGOCIO(1, "Analista Negocio"),
    PLANIFICADOR(2, "Planificador"),
    DESARROLLADOR(3, "Desarrollador"),
    LIDER_EQUIPO(4, "Líder Equipo"),
    ARQUITECTO(5, "Arquitecto");

    private int value;
    private String text;

    LTLabels(int value, String text) {
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
