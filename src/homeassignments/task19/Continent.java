package homeassignments.task19;

public enum Continent {
    EURASIA ("Евразия"),
    AFRICA ("Африка"),
    AUSTRALIA ("Австралия"),
    NORTHAMERICA ("Северная Америка"),
    SOUTHAMERICA ("Южная Америка"),
    ANTARCTIDA ("Антарктида");

    private String value;

    Continent (String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}