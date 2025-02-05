public class human {
    String name;
    String surname;
     int birthYear;
     int iq;
     pet pet;
     human mother;
     human father;
    String[][] schedule;

    public human(String name, String surname, int birthYear, int iq, pet pet, human mother, human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }
    public void describe() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Year of Birth: " + birthYear);
        System.out.println("IQ Level: " + iq);
        if (pet != null) {
            System.out.println("Pet: " + pet.getNickname());
        }
        if (mother != null) {
            System.out.println("Mother: " + mother.name + " " + mother.surname);
        }
        if (father != null) {
            System.out.println("Father: " + father.name + " " + father.surname);
        }
        System.out.println("Schedule: ");
        for (String[] dayActivity : schedule) {
            System.out.println(dayActivity[0] + ": " + dayActivity[1]);
        }
    }

    public static void main(String[] args) {
        pet pet = new pet("Dog", "Buddy", 3, 75, new String[]{"playing", "barking", "eating"});
        human mother = new human("Anna", "Smith", 1980, 90, null, null, null, new String[][]{});
        human father = new human("John", "Smith", 1978, 95, null, null, null, new String[][]{});
        String[][] schedule = {
                {"Monday", "Gym"},
                {"Tuesday", "Coding"},
                {"Wednesday", "Reading"},
                {"Thursday", "Music"},
                {"Friday", "Swimming"},
                {"Saturday", "Gaming"},
                {"Sunday", "Relaxing"}
        };
        human child = new human("Mike", "Smith", 2005, 110, pet, mother, father, schedule);
        child.describe();
        pet.eat();
        pet.respond();
        pet.foul();}

}
