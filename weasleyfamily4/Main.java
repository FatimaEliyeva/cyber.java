public class Main {
    public static void main(String[] args) {
        String[][] motherSchedule = {{DayOfWeek.MONDAY.name(), "Potion brewing "}, {DayOfWeek.TUESDAY.name(), "Quidditch game"}};
        String[][] fatherSchedule = {{DayOfWeek.MONDAY.name(), "dragon racing"}, {DayOfWeek.WEDNESDAY.name(), " Treasure hunting"}};
        String[][] child1Schedule = {{DayOfWeek.MONDAY.name(), "Prank crafting"}, {DayOfWeek.FRIDAY.name(), "Dragon handling"}};
        String[][] child2Schedule = {{DayOfWeek.THURSDAY.name(), "Quidditch training"}, {DayOfWeek.SATURDAY.name(), "Inventing new magical products"}};
        Woman mother = new Woman("Molly", "Weasley", 1950, 120, motherSchedule);
        Man father = new Man("Artur", "Weasley", 1949, 120, fatherSchedule);
        Family family = new Family(mother, father);
        Human child1 = new Human("Percy", "Weasley", 1976, 110, child1Schedule);
        Human child2 = new Human("Charlie", "Weasley", 1972, 100, child2Schedule);
        family.addChild(child1);
        family.addChild(child2);
        Pet pet = new Dog("Fluffy", 5, 60, new String[]{"Play", "Sleep"});
        family.setPet(pet);
        System.out.println("Weasley Family Info Before Modification!");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println(family);
        System.out.println("Human object is garbage collected:");
        boolean deleted = family.deleteChild(child1);
        //System.out.println("deletion of child !" + deleted);
        for (int i = 0; i < 10000000; i++) {
            if (family.deleteChild(child1)) {
                System.gc();
            }
        }
        System.out.println("Weasley Family Info After Deletion!");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println(family);
        System.out.println("Weasley Family consist of " + family.countFamily() + "  members after deletion!");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        family.getPet().eat();
        mother.feedPet(true);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        //mother.greetPet();
        mother.describePet();
        mother.yoga();
        family.getPet().respond();
        mother.greetPet();
        father.chooping();
        father.greetPet();
        //father.chooping();
    }
}