import java.io.*;

interface PerformOperation {
    boolean check(int a);
}

class MyMath {
    public static PerformOperation isOdd() {
        return (n) -> n % 2 != 0;
    }
    public static PerformOperation isPrime() {
        return (n) -> {
            if (n < 2) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };
    }
    public static PerformOperation isPalindrome() {
        return (n) -> {
            String numStr = Integer.toString(n);
            return numStr.equals(new StringBuilder(numStr).reverse().toString());
        };
    }
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String[] input = br.readLine().split(" ");
            int choice = Integer.parseInt(input[0]);
            int num = Integer.parseInt(input[1]);
            
            PerformOperation op;



            switch (choice) {
                case 1:
                    op = ob.isOdd();
                    System.out.println(MyMath.checker(op, num) ? "ODD" : "EVEN");
                    break;
                case 2:
                    op = ob.isPrime();
                    System.out.println(MyMath.checker(op, num) ? "PRIME" : "COMPOSITE");
                    break;
                case 3:
                    op = ob.isPalindrome();
                    System.out.println(MyMath.checker(op, num) ? "PALINDROME" : "NOT PALINDROME");
                    break;
            }
        }
    }
}
