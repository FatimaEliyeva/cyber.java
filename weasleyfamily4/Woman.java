public final class Woman extends Human {
    public Woman(String name, String surname, int year, int iq, String[][] schedule) {
        super(name, surname, year, iq, schedule);
    }

    public void yoga() {
        System.out.println(getName() + " is doing yoga.");
    }

    @Override
    public void greetPet() {
        System.out.println("Hi, " + getFamily().getPet().getNickname() + " is so smart dog!");
    }
}
