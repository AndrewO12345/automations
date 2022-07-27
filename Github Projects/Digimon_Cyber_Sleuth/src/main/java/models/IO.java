package models;

import java.util.Scanner;

public class IO {
    private final Scanner scanner = new Scanner(System.in);
    private static final String REQUIRED
            = "[INVALID] Value is required.";
    private static final String INVALID_NUMBER
            = "[INVALID] Enter a valid number.";
    private static final String NUMBER_OUT_OF_RANGE
            = "[INVALID] Enter a number between %s and %s.";

    public void print(String prompt) {
        System.out.print(prompt);
    }

    public void println(String prompt) {
        System.out.println(prompt);
    }

    public void printf(String format, Object... values) {
        System.out.printf(format, values);
    }

    public int readInt(String prompt) {
        while (true) {
            try {
                return Integer.parseInt(readRequiredString(prompt));
            } catch (NumberFormatException ex) {
                println(INVALID_NUMBER);
            }
        }
    }

    public String readRequiredString(String prompt) {
        while (true) {
            String result = readString(prompt);
            if (!result.isBlank()) {
                return result;
            }
            println(REQUIRED);
        }
    }

    public String readString(String prompt) {
        print(prompt);
        return scanner.nextLine();
    }

    public int readInt(String prompt, int min, int max) {
        while (true) {
            int result = readInt(prompt);
            if (result >= min && result <= max) {
                return result;
            }
            println(String.format(NUMBER_OUT_OF_RANGE, min, max));
        }
    }
}
