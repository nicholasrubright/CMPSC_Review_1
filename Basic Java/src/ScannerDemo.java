
import java.util.Scanner;   // Import scanner package

public class ScannerDemo {

    public static void main(String[] args) {
        System.out.print("Enter a number: "); // Output a string

        int input; // Variable to store user input

        Scanner scanner = new Scanner(System.in);   // Create new scanner object to read from the input
        input = scanner.nextInt(); // Set variable equal to the input

        System.out.println("You entered: " + input); // Output user's input
    }

}
