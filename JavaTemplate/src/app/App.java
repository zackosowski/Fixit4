/*
FIXIT 4

The program below takes a word submitted by the user and spells it back to the user.
Change this program tpop instead tell the user how many vowels are in the word.
For this activity, assume that "y" is not a vowel.

*/

package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.nextLine();

        System.out.println("The word " + word + " is spelled:");

        for (int i = 0; i < word.length(); i++) {

            System.out.println(word.charAt(i));


        }

    }
}