package mx.gluo.management.authorizationservice.enums;

public enum JwtConstants {

    REQUEST_TOKEN_URL(1, "/login"),
    ROLES_KEY(2, "ROLE"),
    USERNAME_KEY(3, "ID"),
    ACCESS_TOKEN_VALIDITY_SECONDS(4, "28800"),
    ISSUER_TOKEN(5, "ISSUER"),
    HEADER_AUTHORIZATION_KEY(6, "Authorization"),
    TOKEN_BEARER_PREFIX(7, "Bearer");

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
