package tasks;

import tools.IOHelper;

import java.util.Arrays;

public class Task4 implements Task {
    public void start() {
        System.out.println("Task 4");
        System.out.print("Input text: ");
        String text = IOHelper.readLine().trim();
        String[] words = text.split("[\\|,|, ]+");     //hi mike&    Mike .mike miket
        Arrays.sort(words);
        System.out.println("Words count: " + words.length + "\nSorted words: ");
        printWords(words);
    }

    private boolean printWords(String[] words) {
        for (String word : words) {
            System.out.println(word);
        }
        return false;
    }
}
