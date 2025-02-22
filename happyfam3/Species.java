public enum Species {
    DOG("DOG",false, 4, true),
    CAT("CAT", false,4, true),
    BIRD("BIRD", true ,2, false),
    FISH("FISH", false,0, false),
    RABBIT("RABBIT", false, 4,true);

    private final String type;
    private final boolean canFly;
    private final int numberOfLegs;
    private final boolean hasFur;

    Species(String type, boolean canFly, int numberOfLegs, boolean hasFur) {
        this.type=type;
        this.canFly = canFly;
        this.numberOfLegs = numberOfLegs;
        this.hasFur = hasFur;
    }
   public String GetType()

   {
       return type;
   }

    public boolean canFly() {
        return canFly;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public boolean hasFur() {
        return hasFur;
    }
}
