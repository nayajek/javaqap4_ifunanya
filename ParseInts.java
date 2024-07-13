import java.util.Scanner;
// Reads a line of text and prints the sum of the integers in the line.

public class ParseInts {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a line of text:");
        String line = scan.nextLine();

        Scanner scanLine = new Scanner(line);
        
        while (scanLine.hasNext()) {
            try {
                int value = Integer.parseInt(scanLine.next());
                sum += value;
        } catch (NumberFormatException e) {
            // print a message that the input is not a valid integer
            System.out.println("Not a valid integer: " + e);
        }
        }
        System.out.println("The sum of the integers on the line is " + sum);
    }
}
