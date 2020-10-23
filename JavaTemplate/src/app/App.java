/*
FIXIT 4

The program below takes a word submitted by the user and counts the number oif letters in the word.
The problem is that it does not store this data and does not output the answer to the user.
Change this program so that it outputs the number of letters in the word to the user.

*/

package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.nextLine();

        for (int i = 0; i < word.length(); i++) {

        }

    }
}