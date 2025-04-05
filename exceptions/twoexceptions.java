import java.util.*;
public class twoexceptions {
    public static void main(String[] args) {
        int[] numbers = {7,8,5,3,1,0};

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter an index>> ");
        int index = scanner.nextInt();

        System.out.print("Enter a divisor (to perform division): ");
        int divisor = scanner.nextInt();

        try {
            System.out.println("the element based on given index >>> " + numbers[index]);

            int result = numbers[index] / divisor;
            System.out.println("result of division>>> " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException is  caught!!!");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException  is caught!!!!");
        }
    }
}
