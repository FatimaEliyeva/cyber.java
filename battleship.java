
import java.util.Random;
import java.util.Scanner;



public class battleship {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Random random =new Random();
        char [][] field =new char [5][5];
        for (int i=0;i<5;i++)
        {
            for (int j=0;j<5;j++)
            {
                field[i][j]='-';
            }
        }
        int targetRow=random.nextInt(6);
        int targetCol=random.nextInt(6);
        System.out.println("All set.Get ready to rumble!");


        while (true)
        {
            printField(field);
            int row=getValidInput(scanner,"Enter row(1-5):")-1;
            int col=getValidInput(scanner,"Enter column(1-5):")-1;

            if (row==targetRow && col==targetCol)
            {


                field[row][col] = 'x';
                printField(field);
                System.out.println("You have won!");
                break;
            } else {
                field[row][col] = '*';
            }
        }
        scanner.close();
    }

    private static int getValidInput(Scanner scanner, String message) {
        int num;
        while (true) {
            System.out.println(message);
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                if (num >= 1 && num <= 5) {
                    scanner.nextLine();
                    return num;
                }
            }
            scanner.nextLine();
            System.out.println("Invalid input. Try again.");
        }
    }

    private static void printField(char[][] field) {
        System.out.println("  1 2 3 4 5");
        for (int i = 0; i < field.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }
}