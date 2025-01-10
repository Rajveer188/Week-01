import java.util.Scanner;

public class PowerCalculator {

    public static void main(String[] args) {
        
        // Create a scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Input for number and power
        System.out.println("Enter the number:");
        int number = input.nextInt();
        System.out.println("Enter the power:");
        int power = input.nextInt();
        
        // Variable to store result
        int result = 1;
        
        // Loop to calculate the power of the number
        for (int i = 1; i <= power; i++) {
            result *= number;
        }
        
        // Output the result
        System.out.println(number + " raised to the power " + power + " is: " + result);
        
        // Close the scanner object to prevent memory leak
        input.close();
    }
}
