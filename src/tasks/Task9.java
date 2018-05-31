package tasks;

import tools.IOHelper;

public class Task9 implements Task{
    public void start() {
        System.out.println("Task 9");
        System.out.print("Input N: ");
        String str = IOHelper.readLine();
        int number;
        if (IOHelper.isInt(str)) {
            number = Integer.parseInt(str);
        } else {
            return;
        }
        printEvenElements(number);
        System.out.println("Sum: " + sum(number));
    }

    private void printEvenElements(int n) {
        for (int i = 0; i <= n; i += 2) {
            System.out.println(i);
        }
    }

    private int sum(int n) {
        return ((4 + 2 * ((n / 2) - 1)) / 2) * (n / 2);
    }
}
