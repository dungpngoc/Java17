package thisDemo;

public enum Size {
    SMALL("S"), MEDIUM("M"), LARGE("L");

    private String value;

    private Size(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
