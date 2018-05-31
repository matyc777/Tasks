package tasks;

import tools.IOHelper;

public class Task2 implements Task {
    public void start() {
        System.out.println("Task 2");
        System.out.print("First number: ");
        String str = IOHelper.readLine();
        int number1;
        int number2;
        if (IOHelper.isInt(str)) {
            number1 = Integer.parseInt(str);
        } else {
            return;
        }
        System.out.print("Second number: ");
        str = IOHelper.readLine();
        if (IOHelper.isInt(str)) {
            number2 = Integer.parseInt(str);
        } else {
            return;
        }
        System.out.println("Sum: " + sum(number1, number2));
        System.out.println("Difference: " + difference(number1, number2));
        System.out.println("Greatest common divisor: " + gcd(number1, number2));
        System.out.println("Least common multiple: " + lcm(number1, number2));
    }

    private int sum(int a, int b) {

        return a + b;
    }

    private int difference(int a, int b) {

        return a - b;
    }

    private int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return a + b;
    }

    private int lcm(int a, int b) {
        return Math.abs(a / gcd(a, b) * b);
    }
}