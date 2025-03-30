package homeassignments.task13;

public enum Status {
    ACTIVE ("Активный"),
    NOT_ACTIVE ("Неактивный");

    private String value;

    Status (String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}