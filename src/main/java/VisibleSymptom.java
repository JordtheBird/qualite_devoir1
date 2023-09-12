public enum VisibleSymptom {
    COLD(false),
    FLU(false),
    EBOLA(false),
    BROKEN_BONE(true),
    CHEST_PAIN(false),
    MIGRAINE(false),
    SPRAIN(true),
    CORONAVIRUS(false),
    OVERDOSE(false);

    private final boolean requiresRadiology;

    VisibleSymptom(boolean requiresRadiology){
        this.requiresRadiology = requiresRadiology;
    }

    public boolean DoesRequireRadiology(){
        return requiresRadiology;
    }
}
