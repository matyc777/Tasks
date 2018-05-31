package tasks;

import tools.IOHelper;

import java.util.HashSet;
import java.util.Set;

public class Task10 implements Task {
    public void start() {
        System.out.println("Task 10");
        String str;
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + " number: ");
            str = IOHelper.readLine();
            if (IOHelper.isInt(str) && Integer.parseInt(str) / 10 < 1 && Integer.parseInt(str) > -1) {
                arr[i] = Integer.parseInt(str);
            } else {
                System.out.println("Wrong input");
                return;
            }
        }
        printNumbers(getNumbers(arr));
    }

    private Set<Integer> getNumbers(int[] arr){
        Set<Integer> numbers = new HashSet<>();
        int number;
        for (int i = 0; i < 3; i++) {
            number = arr[i] * 100;
            for (int j = 0; j < 3; j++) {
                number += arr[j] * 10;
                for (int k = 0; k < 3; k++) {
                    number += arr[k];
                    if (number >= 100) numbers.add(number);
                    number -= arr[k];
                }
                number -= arr[j] * 10;
            }
        }
        return numbers;
    }

    private void printNumbers(Set<Integer> numbers) {

        for (Integer numb: numbers) {
            System.out.println(numb);
        }
    }
}