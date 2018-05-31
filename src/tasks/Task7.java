package tasks;

import tools.IOHelper;

import java.util.Random;

public class Task7 implements Task{
    public void start() {
        System.out.println("Task 7");
        System.out.print("Input array size: ");
        String str = IOHelper.readLine();
        int n;
        if (IOHelper.isInt(str) && Integer.parseInt(str) > 0) {
            n = Integer.parseInt(str);
        } else {
            System.out.println("Wrong input");
            return;
        }
        int[] arr = new int[n];
        randomArray(arr, 10, 99);
        outputArray(arr);
        System.out.println();
        System.out.println("Max: " + getMax(arr) + " Min: " + getMin(arr));
    }
    private int getMax(int[]array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        return max;
    }
    private int getMin(int[]array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            min = Math.min(min, array[i]);
        }
        return min;
    }
    private boolean randomArray(int[] array,int min,int max) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = min + (int) (Math.random() * (max - min + 1));
            if (random.nextBoolean()) array[i] *= -1;
        }
        return false;
    }
    private boolean outputArray(int[] array) {
        for (int i = 0; i < array.length; i++) {

            System.out.print(" " + array[i]);
        }
        return false;
    }
}
