package ovh.sixbt.domain.models;

public enum EContactScope {
    PUBLIC("PUBLIC"),
    PRIVATE("PRIVATE");

    private final String scope;

    EContactScope(final String scope) {
        this.scope = scope;
    }

    @Override
    public String toString() {
        return this.scope;
    }
}
