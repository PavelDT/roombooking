package utility;

import java.text.ParseException;
import java.util.Scanner;

public class IOScanner {

    private static Scanner myObj = new Scanner(System.in);

    public static Integer getInt() {
        System.out.print("input number: ");
        String input = myObj.nextLine();
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException ex) {
            // Exception is caught but a new one is thrown to make it crash
            // The runtime exception wraps the NFE
            // The alternative to crashing here is returning a default number, which is undesired.
            throw new RuntimeException("Error, input isn't a number!", ex);
        }
    }

    public static String getString() {
        System.out.print("input string: ");
        // Read user input using the static scanner
        String input = myObj.nextLine();

        return input;
    }
}
