package tasks;

import tools.IOHelper;

public class Task5 implements Task {
    public void start() {
        System.out.println("Task 5");
        System.out.print("Input text: ");
        String text = IOHelper.readLine().trim();
        System.out.print("Input word: ");
        String word = IOHelper.readLine().trim();
        System.out.println("Number of words in text: " + numberOfWords(text, word));
    }

    private int numberOfWords(String text, String word) {
        text = text.toLowerCase();
        word = word.toLowerCase();
        int startIndex = text.indexOf(word);
        int count = 0;
        while(startIndex > -1) {
            int indexEnd = startIndex + word.length();
            if (startIndex == 0 ? true : (!Character.isLetter(text.charAt(startIndex - 1)))) {
                if ((indexEnd == text.length() ? true : (!Character.isLetter(text.charAt(indexEnd))))) {
                    count++;
                }
            }
            text = text.substring(startIndex + word.length());
            startIndex = text.indexOf(word);
        }
        return count;
    }
}
