package instruments;

public enum InstrumentType {

    BRASS ("Brass"),
    STRINGS ("Strings"),
    WOODWIND ("Woodwind"),
    KEYBOARD ("Keyboard");

private final String type;

    InstrumentType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
