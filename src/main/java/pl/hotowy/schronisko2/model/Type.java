package pl.hotowy.schronisko2.model;

public enum Type {
    CATS("Koty"),
    DOGS("Psy"),
    OTHER("Inne");

    private final String PL_TYPE;

    Type(String PL_TYPE) {
        this.PL_TYPE = PL_TYPE;
    }

    public String getPL_TYPE() {
        return PL_TYPE;
    }
}
