public class Main {
    public static void main(String[] args) {
        String[] petHabits = {"eat", "drink", "sleep"};
        Pet pet = new Pet("dog", "Cooper", 2, 53, petHabits);
        Human mother = new Human("Scarlett", "Johansson", 1984, 120, new String[][] {{"Monday", "Martial Arts"}, {"Friday", "Pilates"}});
        Human father = new Human("Elvis", "Presley", 1935, 120, new String[][] {{"Monday", "Camping"}, {"Wednesday", "Skateboarding"}});
        Family family = new Family(mother, father);
        family.SettingPet(pet);
        Human child1 = new Human("Gitanjali", "Rao", 2005, 180, new String[][] {{"Monday", "Public Speaking"}, {"Friday", "Inventing-STEM"}});
        Human child2 = new Human("Tanishq", "Abraham", 2003, 214, new String[][] {{"Thursday", "Playing piano"}, {"Wednesday", "Science and Research"}});
        Human child3 = new Human("Ainan", "Celeste Cawley", 1999, 236, new String[][] {{"Monday", "Chemistry Research"}, {"Wednesday", "Music"}});
        family.AddingChild(child1);
        family.AddingChild(child2);
        family.AddingChild(child3);
        System.out.println(family.toString());
        System.out.println("Family member count: " + family.countFamily());
        family.deleteChild(0);
        System.out.println(family.toString());
        System.out.println("Family member count: " + family.countFamily());
    }
}