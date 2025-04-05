import java.util.Scanner;
class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}
public class customexception {
    public static void check(int number) throws InvalidInputException {
        if (number > 10) {
            throw new InvalidInputException("the input should be less than 10!");
        } else {
            System.out.println(number + "is accepted !!! ");
        }
    }
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("the num>>> ");
            int number = scanner.nextInt();
            check(number);
        } catch (InvalidInputException e) {
            System.out.println("InvalidInputException is caught!");
        }
    }
}
