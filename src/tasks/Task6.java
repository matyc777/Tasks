package tasks;

import tools.IOHelper;

public class Task6 implements Task{
    public void start() {
        System.out.println("Task 6");
        String number;
        double[] arr = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print((i+1) + " number: ");
            number = IOHelper.readLine();
            if (IOHelper.isDouble(number)) {
                arr[i] = Double.parseDouble(number.trim());
            } else {
                return;
            }
        }
        System.out.println("Is right triangle?: " + ((isRightTriangle(arr)) ? "yes" : "no"));
    }

    private int getMax(double[] array) {
        int indexMax = 0;
        double max = array[0];
        for (int i = 1; i < 3; i++) {
            if (max < array[i]) {
                indexMax = i;
                max = array[i];
            }
        }
        return indexMax;
    }

    private boolean isRightTriangle(double[] array) {
        int indexMax = getMax(array);
        if (isTriangle(array)) {
            return Math.pow(array[(indexMax + 2) % 3], 2.0) + Math.pow(array[(indexMax + 1) % 3], 2.0)
                    == Math.pow(array[indexMax], 2.0);
        }
        return false;
    }

    private boolean isTriangle(double[] array) {
        return ((array[0] + array[1] > array[2]) && (array[0] + array[2] > array[1]));
    }
}

