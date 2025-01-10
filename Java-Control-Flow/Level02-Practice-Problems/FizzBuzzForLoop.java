import java.util.Scanner;

public class FizzBuzzForLoop {

    public static void main(String[] args) {
        
        // Create a scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt user for the upper limit of the loop
        System.out.println("Enter a number to perform FizzBuzz:");
        int number = input.nextInt();
        
        // Loop from 1 to the entered number
        for (int i = 1; i <= number; i++) {
            // Check if the number is divisible by both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // Check if the number is divisible by 3
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // Check if the number is divisible by 5
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // Print the number if it is not divisible by 3 or 5
            else {
                System.out.println(i);
            }
        }
        
        // Close the scanner object
        input.close();
    }
}
