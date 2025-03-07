public class DomesticCat extends Pet implements Foulable {
    public DomesticCat(String nickname, int age, int trickLevel, String[] habits) {
        super(Species.DOMESTIC_CAT, nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.println(getNickname() + " the cat is meowing.");
    }

    @Override
    public void foul() {
        System.out.println(getNickname() + " the cat is scratching the furniture.");
    }
}