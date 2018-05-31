package tasks;

import tools.IOHelper;

public class Task3 implements Task{
    public void start(){
        System.out.println("Task 3");
        System.out.print("Input word: ");
        if(isPalindrome(IOHelper.readLine()))System.out.println("Palindrome");
        else System.out.println("Is not palindrome");

    }

    private boolean isPalindrome(String word){
        boolean flag = true;
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
