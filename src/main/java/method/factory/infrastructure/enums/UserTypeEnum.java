package method.factory.infrastructure.enums;

public enum UserTypeEnum {

    CLIENTE("CLIENTE"),
    LOJISTA("LOJISTA");

    private String type;

    UserTypeEnum(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
