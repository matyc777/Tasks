package tools;

import java.util.Scanner;

public class IOHelper {
    public static String readLine() {
        return new Scanner(System.in).nextLine();
    }

    public static boolean isInt(String number) {
        boolean correct = true;
        try {
            Integer.parseInt(number.trim());
        } catch (NumberFormatException e) {
            try {
                Float.parseFloat(number.trim());
                System.out.print("A fractional number is entered");
            } catch (NumberFormatException ex) {
                System.out.println("Not a number is entered");
            }
            correct=false;
        }
        return correct;
    }

    public static boolean isDouble(String number) {
        boolean flag = true;
        try {
            Float.parseFloat(number.trim());
        } catch (NumberFormatException ex) {
            System.out.println("Not a number is entered");
            flag = false;
        }
        return flag;
    }
}
