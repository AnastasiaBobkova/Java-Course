package homeassignments.task14;

public enum Sex {
    MALE ("Мужской"),
    FEMALE ("Женский");

    private String value;

    Sex (String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}