import java.util.Arrays;

public class Pet {
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    public Pet() {
    }

    public Pet(Species species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public void eat() {
        System.out.println("I am eating");
    }

    public void respond() {
        System.out.println("Hello, owner. I am " + nickname + ". I miss you!");
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }
/*
    @Override
    public String toString() {
        return "Pet{species='" + species + "', nickname='" + nickname + "', age=" + age + ", trickLevel=" + trickLevel + ", habits=" + Arrays.toString(habits) + "}";
    }
*/
@Override
public String toString(){
    return "%s{nickname=%s, age=%d, trickLevel=%d, habits=[%s], can fly=%s, the number of legs=%d, has fur=%s}"
            .formatted(this.species.GetType(), this.nickname, this.age, this.trickLevel, String.join(", ", habits),
                    (this.species.canFly()) ? "Yes" : "No", this.species.getNumberOfLegs(), (this.species.hasFur()) ? "Yes" : "No");
}
    @SuppressWarnings("removal")
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is being garbage collected.");

    }
}