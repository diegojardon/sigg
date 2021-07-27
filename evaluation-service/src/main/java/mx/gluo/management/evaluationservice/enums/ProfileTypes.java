package mx.gluo.management.evaluationservice.enums;

public enum ProfileTypes {

    BASIC(1, "Roadmap Básico"),
    DEV_BACK_END(2, "Roadmap Dev Back-End"),
    DEV_FRONT_END(3, "Roadmap Dev Front-End"),
    TECH_LEAD(4, "Roadmap Líder Técnico");

    private int value;
    private String text;

    ProfileTypes(int value, String text) {
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
