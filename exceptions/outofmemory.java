import java.util.*;
public class outofmemory {
    public static void main(String[] args) {
        try {
            int[] myArray = new int[Integer.MAX_VALUE];
        } catch (OutOfMemoryError e) {
            System.out.println("OutOfMemoryError is caught !!!");
        }
    }
}
