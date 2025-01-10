import java.util.Scanner;
class AbundantNumber {

    public static void main(String[] args) {
        
        // Create a scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Input for the number
        System.out.println("Enter a number to check if it is an Abundant number:");
        int number = input.nextInt();
        
        int sum = 0;
        
        //Loop to find divisors and sum them
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {  // Check if i is a divisor of number
                sum += i;
            }
        }
        
        //Check if the sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant number.");
        } else {
            System.out.println(number + " is not an Abundant number.");
        }
        input.close();
    }
}
