import java.util.Scanner;
public class weekPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] schedule = {
                {"Sunday", "do home work"},
                {"Monday", "go to courses; watch a film"},
                {"Tuesday", "go to gym"},
                {"Wednesday", "attend meetings"},
                {"Thursday", "read a book"},
                {"Friday", "go to a party"},
                {"Saturday", "do shopping"}
        };

        while (true) {
            System.out.println("Please, input the day of the week: ");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("exit"))
            {
                break;
            }

            boolean found = false;
            for (int i = 0; i < schedule.length; i++)
            {
                if (schedule[i][0].equalsIgnoreCase(input))
                {
                    System.out.println("Your tasks for " + schedule[i][0] + ": " + schedule[i][1] + ".");
                    found = true;
                    break;
                }
            }

            if (!found)
            {
                System.out.println("Sorry, I don't understand you, please try again.");
            }
        }
        scanner.close();
    }
}