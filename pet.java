public class pet {
    String species;
    String nickname;
    int age;
    int trickLevel;
    String[] habits;

    public pet(String species, String nickname, int age, int trickLevel, String[] habits) {
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
        System.out.println("Hello I am " + nickname + "i miss you!");

    }
    public void foul() {
        System.out.println("I need to cover it up");
    }

    public String getNickname() {
        return nickname;
    }
}


