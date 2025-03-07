public final class Man extends Human {
    public Man(String name, String surname, int year, int iq, String[][] schedule) {
        super(name, surname, year, iq, schedule);
    }

    public void chooping() {
        System.out.println(getName() + " is  chopping wood.");
    }

    @Override
    public void greetPet() {
        System.out.println("Heyyo, " + getFamily().getPet().getNickname() + "! Ready for some belly rubs?");
    }
}
