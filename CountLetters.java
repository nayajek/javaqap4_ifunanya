import java.util.Scanner;
// Reads a word from the user and counts the frequency of each letter.
public class CountLetters {
    public static void main(String[] args) {
        int[] counts = new int[26];
        Scanner scan = new Scanner(System.in);

        // get word from user
        System.out.print("Enter a single word (letters only, please): ");
        String word = scan.nextLine();

        // convert to all upper case
        word = word.toUpperCase();

        // count frequency of each letter in string
        for (int i = 0; i < word.length(); i++) {
            try {
                counts[word.charAt(i) - 'A']++;
            } catch (ArrayIndexOutOfBoundsException e) {
                // Option 1: Empty catch block (first part of the task)
                // System.out.println("Not a letter");
                // Option 2: Print a useful message with the exception (second part of the task)
                // System.out.println("Not a letter: " + e);

                // Option 3: Print a useful message with the character (third part of the task)
                System.out.println("Not a letter: " + word.charAt(i));
            }
        }

        // print frequencies
        System.out.println();
        for (int i = 0; i < counts.length; i++)
            if (counts[i] != 0)
                System.out.println((char) (i + 'A') + ": " + counts[i]);
    }
}