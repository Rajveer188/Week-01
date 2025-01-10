import java.util.Scanner;

class ArmstrongNumber {

    public static void main(String[] args) {
        
        // Create a scanner object
        Scanner input = new Scanner(System.in);
        
        //Input for the number
        System.out.println("Enter a number to check if it is an Armstrong number:");
        int number = input.nextInt();
        
        //Initialize sum and originalNumber
        int sum = 0;
        int originalNumber = number;
        
        // Loop to calculate the sum of cubes of the digits
        while (number != 0) {
            int digit = number % 10;  // Get the last digit
            sum += Math.pow(digit, 3);  // Add the cube of the digit to sum
            number /= 10;  // Remove the last digit
        }
        
        //Check if the sum equals the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
        
        // Close the scanner object
        input.close();
    }
}
