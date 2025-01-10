import java.util.Scanner;
class DigitCount {

    public static void main(String[] args) {
        
        // Create a scanner object
        Scanner input = new Scanner(System.in);
        
        // Input for the number
        System.out.println("Enter a number to count its digits:");
        int number = input.nextInt();
        
        // Initialize count variable
        int count = 0;
        
        // Loop to count digits by removing the last digit in each iteration
        while (number != 0) {
            number /= 10;  // Remove the last digit
            count++;  
        }
        
        // Output the count of digits
        System.out.println("The number has " + count + " digits.");
        
        input.close();
    }
}
