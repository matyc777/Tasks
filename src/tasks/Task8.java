package tasks;

import tools.IOHelper;

public class Task8 implements Task{
    public void start() {
        System.out.println("Task 8");
        System.out.print("Input N: ");
        String str = IOHelper.readLine();
        int number;
        if (IOHelper.isInt(str) && Integer.parseInt(str) <= 100) {
            number = Integer.parseInt(str);
        } else {
            System.out.println("Wrong input");
            return;
        }
        allPalindromes(number);
    }

    private void allPalindromes(int n) {
        for (int i = 0; i < n; i++) {
            if (i / 10 < 1 || i % 11 == 0) {
                System.out.println(i);
            }
        }
    }
}
