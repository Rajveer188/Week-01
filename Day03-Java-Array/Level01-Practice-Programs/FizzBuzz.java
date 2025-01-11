// Importing Scanner class
import java.util.Scanner;

class FizzBuzz {
    // Main method
    public static void main(String[] args) {
        // Creating an object of Scanner class
        Scanner input = new Scanner(System.in);

        //input number
        System.out.println("Enter a number");
        int number = input.nextInt();
        if (number <= 0) {
            System.out.println("Please enter a positive integer");
            return;
        }

        // Create String array to stor results
        String[] results = new String[number + 1];

        for (int i = 1; i <= number; i++){
            if(i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            }else if (i % 3 == 0) {
                results[i] = "Fizz";
            }else if (i % 5 == 0){
                results[i] = "Buzz";
            }else {
                results[i] = String.valueOf(i);
            }
        }

        // Display results
        for (int i = 1; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }

        // Close Scanner
        input.close();
    }
}
