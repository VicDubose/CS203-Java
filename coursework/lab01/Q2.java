/**
 * 
 */
package lab01;

import java.util.Scanner;

public class Q2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word: ");
        String word = scanner.next();
        System.out.println("Your word is: "+ word);
        scanner.close();
        int wordLen = word.length(); 
        int middleLoc = wordLen/2;
        char middleCh= word.charAt(middleLoc);
        System.out.println("The middle character is: "+ middleCh);
    }
}