//Abby Jahns 01.14.25
//Count Char - Lab 1 - Recursion
//enter a string and then a letter
//output how many times that letter appears in the string
//use recursion
import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String phrase = input.nextLine();
        System.out.print("Enter a character: ");
        String letter = input.nextLine();

        //turn string phrase into a char array & letter to char
        phrase.toLowerCase();
        char[] charPhrase = new char[phrase.length()];
        charPhrase = phrase.toCharArray();
        char charLetter = letter.charAt(0);

        //calls helper count method
        int count = count(charPhrase, charLetter);

        System.out.printf("'%c' appears %d times", charLetter, count);

    }//end main method

    public static int count(char[] phrase, char letter) {
        return count(phrase, letter, 0);
    }//end helper method count

    //recursion method
    //return int for count of specified char's
    public static int count(char[] phrase, char letter, int place) {
        //if at end of phrase length, end and return count
        //System.out.println("Place = " + place); //test code
        if (place == phrase.length) {
            return 0;
        }
        //if char == char at phrase[] then count +1
        else if (phrase[place] == letter) {
            return 1 + count(phrase, letter, place + 1);
        } else {
            //else, move to next letter but don't increase count
            return count(phrase, letter, place + 1);
        }
    }//end count method
}//end class method
