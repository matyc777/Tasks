package tasks;

import tools.IOHelper;

public class Task1 implements Task{
    @Override
    public void start(){
        System.out.println("Task 1");
        System.out.print("Input number: ");
        String str = IOHelper.readLine();
        int number;
        if (IOHelper.isInt(str)) {
            number = Integer.parseInt(str);
        } else {
            return;
        }
        if (isEven(number)) {
            System.out.println("Is even number");
        } else {
            System.out.println("Is odd number");
        }
        isCompound(number);
    }
    private boolean isEven(int number) {
        boolean even = false;
        if (number % 2 == 0) {
            even = true;
        }
        return even;
    }

    private boolean isCompound(int number) {
        boolean compound = false;
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                compound = true;
                System.out.println("Is compound number");
                break;
            }
        }
        if (number < 2) {
            System.out.println("Not prime and not is compound number");
        } else if (!compound) {
            System.out.println("Prime");
        }
        return compound;
    }
}
