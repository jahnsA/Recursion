//Abby Jahns 
//01.14.25
//Test if a word is a palindrome using recursion
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string;
        System.out.println("Check if Palindrome:");
        System.out.println("(Enter 'q' to quit)");
        
        do {
            System.out.print("Enter a word: ");
            string = input.nextLine();
            if (!string.equals("q")) {
                //call palindrome method here
                if (palindrome(string)) {
                    System.out.println("True");
                    System.out.println(string + " is a palindrome.");
                } else {
                    System.out.println("False");
                    System.out.println(string + " is not a palindrome.");
                }
            }
        } while (!string.equals("q"));
    }//end main method

    //makes char array with char in reverse order of word string
    //calls recusrive palindrome method with both char arrays
    //returns true or false from palindrome method
    public static boolean palindrome(String string) {
        string = string.toLowerCase();
        char[] word = string.toCharArray();
        char[] wordBackwards = new char[string.length()];
        for (int i = string.length() - 1; i >= 0; i--) {
            wordBackwards[(string.length() - 1) - i] = word[i];
        }
        return palindrome(word, wordBackwards, string.length() - 1);
    }//end palindrome helper method

    //recursive method
    public static boolean palindrome(char[] word, char[] backwards, int n) {
        //if letters dont match, return false
        if (word[n] != backwards[n]) {
            return false;
        }
       //if not to the middle yet, keep going 
        if (word.length/2 <= n) {
            palindrome(word, backwards, n - 1);        
        }
        //else, all letters are same, return true
        return true;
    }//end palindrome method

}//end class Palindrome
