package mx.gluo.management.evaluationservice.enums;

public enum InglesLabels {

    SPEAKING(1, "Speaking"),
    LISTENING(2, "Listening"),
    READING(3, "Reading");

    private int value;
    private String text;

    InglesLabels(int value, String text) {
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
