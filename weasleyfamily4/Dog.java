public class Dog extends Pet implements Foulable {
    public Dog(String nickname, int age, int trickLevel, String[] habits) {
        super(Species.DOG, nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.println(getNickname() + " The dog is bringing back the ball.");
    }

    @Override
    public void foul() {
        System.out.println(getNickname() + " the dog is digging the garden.");
    }
}