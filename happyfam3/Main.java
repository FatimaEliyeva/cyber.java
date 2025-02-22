import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
//import java.time.DayOfWeek;


        //Human father = new Human("Elvis", "Presley", 1935, 120); /*, new String[][] {{"Monday", "Camping"}, {"Wednesday", "Skateboarding"}}*/

   /*     Map<DayOfWeek, String> fatherSchedule = new HashMap<>();
        fatherSchedule.put(DayOfWeek.MONDAY, "Camping");
        fatherSchedule.put(DayOfWeek.WEDNESDAY, "Skateboarding");
        Human father = new Human("Elvis", "Presley", 1935, 120, fatherSchedule);


        Family family = new Family(mother, father);
        family.SettingPet(pet);
        //Human child1 = new Human("Gitanjali", "Rao", 2005, 180) ; //new String[][] {{"Monday", "Public Speaking"}, {"Friday", "Inventing-STEM"}});

        //Human child1 = new Human("Gitanjali", "Rao", 2005, 180, child1Schedule);

        //Human child2 = new Human("Tanishq", "Abraham", 2003, 214, child2Schedule);


        //Human child2 = new Human("Tanishq", "Abraham", 2003, 214); //new String[][] {{"Thursday", "Playing piano"}, {"Wednesday", "Science and Research"}});

        Human child3 = new Human("Ainan", "Celeste Cawley", 1999, 236, child3Schedule);

        family.AddingChild(child1);
        family.AddingChild(child2);
        family.AddingChild(child3);
        System.out.println(family.toString());
        System.out.println("Family member count: " + family.countFamily());
        family.deleteChild(0);
        System.out.println(family.toString());
        System.out.println("Family member count: " + family.countFamily());
        System.out.println("\nMother's Schedule:");
        mother.printSchedule();
        System.out.println("\nFather's Schedule:");
        father.printSchedule();
        System.out.println("\nChild 1's Schedule:");
        child1.printSchedule();
        System.out.println("\nChild 2's Schedule:");
        child2.printSchedule();
        System.out.println("\nChild 3's Schedule:");
        child3.printSchedule();
    }
}

*/

   public class Main {

       public static void main(String[] args) {
           String[] petHabits = {"eat", "drink", "sleep"};
           Pet pet = new Pet(Species.DOG, "Cooper", 2, 53, petHabits);

           Map<DayOfWeek, String> child1Schedule = new TreeMap<>();
           child1Schedule.put(DayOfWeek.MONDAY, "Public Speaking");
           child1Schedule.put(DayOfWeek.FRIDAY, "Inventing-STEM");
           Map<DayOfWeek, String> child2Schedule = new TreeMap<>();
           child2Schedule.put(DayOfWeek.THURSDAY, "Playing piano");
           child2Schedule.put(DayOfWeek.WEDNESDAY, "Science and Research");
           Map<DayOfWeek, String> child3Schedule = new TreeMap<>();
           child3Schedule.put(DayOfWeek.MONDAY, "Chemistry Research");
           child3Schedule.put(DayOfWeek.WEDNESDAY, "Music");


           Human child1 = new Human("Gitanjali", "Rao", 2005, 180, child1Schedule);
           Human child2 = new Human("Tanishq", "Abraham", 2003, 214, child2Schedule);
           Human child3 = new Human("Ainan", "Celeste Cawley", 1999, 236, child3Schedule);


           Map<DayOfWeek, String> motherSchedule = new TreeMap<>();
           motherSchedule.put(DayOfWeek.MONDAY, "Martial Arts");
           motherSchedule.put(DayOfWeek.FRIDAY, "Pilates");
           Human mother = new Human("Scarlett", "Johansson", 1984, 120, motherSchedule);


           Map<DayOfWeek, String> fatherSchedule = new TreeMap<>();
           fatherSchedule.put(DayOfWeek.MONDAY, "Camping");
           fatherSchedule.put(DayOfWeek.WEDNESDAY, "Skateboarding");
           Human father = new Human("Elvis", "Presley", 1935, 120, fatherSchedule);

           Family family = new Family(mother, father);
           family.SettingPet(pet);

           family.AddingChild(child1);
           family.AddingChild(child2);
           family.AddingChild(child3);
           System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

           System.out.println("Family Details Before Deletion:");
           System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

           System.out.println(family.toString());
           System.out.println("Family member count: " + family.countFamily());

           // Delete a child and show updated family details
           family.deleteChild(0);
           System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
           System.out.println("Family Details After Deletion:");
           System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

           System.out.println(family.toString());
           System.out.println("Family member count: " + family.countFamily());

           family.deleteChild(child2);
           System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
           System.out.println("Family Details After Deletion:");

           System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
           System.out.println(family.toString());
           System.out.println("Family member count: " + family.countFamily());

           family.deleteChildrenWithIndex(0);
           for (int i = 0; i < 10000000; i++) {
               if (family.deleteChild(child1)) {
                   System.gc();
               }
           }
           }


   }




