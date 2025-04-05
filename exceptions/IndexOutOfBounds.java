public class IndexOutOfBounds {
    public static void main(String[] args) {
        int[] numbers = {10,12,13,14,56};

        try {
            System.out.println(numbers[12]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught!");
        }
    }
}
