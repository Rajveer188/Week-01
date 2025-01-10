import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {
        
        // Create a scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt user for the number to check
        System.out.println("Enter a number to check if it is prime:");
        int number = input.nextInt();
        
        // Initialize the boolean variable to track if the number is prime
        boolean isPrime = true;
        
        // Check if the number is greater than 1
        if (number > 1) {
            // Loop from 2 to the number - 1 to check divisibility
            for (int i = 2; i < number; i++) {
                // If the number is divisible by any number between 2 and number-1
                if (number % i == 0) {
                    isPrime = false;  // It's not prime
                    break;  // Exit the loop as we found a divisor
                }
            }
        } else {
            isPrime = false;  // Numbers less than or equal to 1 are not prime
        }
        
        // Output the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        
        // Close the scanner object
        input.close();
    }
}
