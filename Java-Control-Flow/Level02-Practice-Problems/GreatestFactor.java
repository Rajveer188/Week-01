import java.util.Scanner;

public class GreatestFactor {

    public static void main(String[] args) {
        
        // Create a scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Input for the number
        System.out.println("Enter a number to find its greatest factor:");
        int number = input.nextInt();
        
        // Variable to store the greatest factor
        int greatestFactor = 1;
        
        // Loop to find the greatest factor
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }
        
        // Output the greatest factor
        System.out.println("The greatest factor of " + number + " is: " + greatestFactor);
        
        // Close the scanner object to prevent memory leak
        input.close();
    }
}
