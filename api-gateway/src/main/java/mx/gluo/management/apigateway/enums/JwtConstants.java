package mx.gluo.management.apigateway.enums;

public enum JwtConstants {

    BEARER_TOKEN_PREFIX(1, "Bearer");

    private int value;
    private String text;

    JwtConstants(int value, String text) {
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
