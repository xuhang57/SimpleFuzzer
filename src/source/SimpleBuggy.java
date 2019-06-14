package source;

import java.util.concurrent.TimeUnit;

public class SimpleBuggy {
    private static void process(String str) {
        // First crash
        if (str.equals("z")) {
            throw new RuntimeException();
        }

        // Second crash
        if (str.equals("X")) {
            throw new IllegalArgumentException();
        }

        // Third crash
        if (str.equals("nul")) {
            throw new NullPointerException();
        }

        // Fourth crash
        if (str.equals("Xa")) {
            throw new IllegalArgumentException();
        }

        // Fifth crash
        if (str.equals("iae")) {
            throw new IndexOutOfBoundsException();
        }

        // Sixth crash
        if (str.equals("Kate")) {
            throw new SecurityException();
        }

        // Seventh crash
        if (str.equals("Lucas")) {
            throw new UnsupportedOperationException();
        }

        // Eighth crash
        if (str.equals("Josh")) {
            throw new NegativeArraySizeException();
        }

    }

    public static void main(String[] args) {
        String userInput = args[0];
        SimpleBuggy.process(userInput);
    }
}
