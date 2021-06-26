package ovh.sixbt.business.core;

public enum EContactCategory {
    PRO("PRO"),
    PRI("PRI");

    private final String category;

    EContactCategory(final String category){
        this.category = category;
    }

    @Override
    public String toString() {
        return  this.category;
    }
}
