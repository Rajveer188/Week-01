import java.util.Scanner;
class HarshadNumber {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Input for the number
        System.out.println("Enter a number to check if it is a Harshad number:");
        int number = input.nextInt();
        
        // Initialize sum variable
        int sum = 0;
        int originalNumber = number;
        
        //Loop to find the sum of digits
        while (number != 0) {
            sum += number % 10;  // Add the last digit to sum
            number /= 10;  // Remove the last digit
        }
        
        // Check if the number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad number.");
        }
        
        input.close();
    }
}
