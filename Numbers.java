
import java.util.Random;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] guesses = new String[1000];
        int index=0;
        int secretNumber = random.nextInt(101);
        System.out.println("Let the game begin!");

        while (true) {
            System.out.println("Please, enter your name:");
            String name = scanner.nextLine();

            while (true) {
                System.out.println("Enter a number between 0 and 100:");
                String guess = scanner.nextLine();
                if (isNumber(guess)) {
                    int guessNumber = Integer.parseInt(guess);
                    guesses[index++] = guess;
                    if (guessNumber == secretNumber) {
                        System.out.println("Congratulations, " + name + "!");
                        break;
                    } else if (guessNumber < secretNumber) {
                        System.out.println("Your number is too small. Please, try again.");
                    } else {
                        System.out.println("Your number is too big. Please, try again.");
                    }
                } else {
                    System.out.println("Invalid input. Please, enter a number.");
                }
            }

            System.out.println("Your numbers:");
            for (int i = index - 1; i >= 0; i--) {
                System.out.println(guesses[i]);
            }
            System.out.println("Would you like to play again with a new number? (yes/no)");
            String playAgain = scanner.nextLine();
            if (!playAgain.equals("yes")) {
                break;
            }
        }

        scanner.close();
    }

    public static boolean isNumber(String guess) {
        try {
            Integer.parseInt(guess);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
