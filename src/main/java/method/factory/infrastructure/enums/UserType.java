package method.factory.infrastructure.enums;

public enum UserType {

    CLIENTE("CLIENTE"),
    LOJISTA("LOJISTA");

    private String type;

    UserType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
