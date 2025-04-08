package lesson6;

import java.io.IOException;

public class GlobalExceptionHandler {
    public static void handle(Throwable t) {
        System.err.println("GLOBAL ERROR HANDLER CAUGHT: " + t.getMessage());
        if (t instanceof IOException) {
            System.err.println("Critical I/O error. Application exiting.");
            System.exit(1);
        }
    }
}
