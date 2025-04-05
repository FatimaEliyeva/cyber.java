public class stackoverflow {
    public static void recursiveMethod() {
        recursiveMethod();
    }
    public static void main(String[] args) {
        try {
            recursiveMethod();
        } catch (StackOverflowError e) {
            System.out.println("StackOverFlow Exception is caught !!!");
        }
    }
}
