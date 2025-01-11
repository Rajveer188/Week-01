//Importing Scanner class
import java.util.Scanner;

class OddEvenArrays {
    // Main method
    public static void main(String[] args) {
        //Creating an object of Scanner class
        Scanner input = new Scanner(System.in);

        // Input number
        System.out.println("Enter a number:");
        int number = input.nextInt();
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number.");
            return;
        }

        // Arrays for odd and even numbers
        int[] evenNumbers = new int[number / 2 + 1];
        int[] oddNumbers = new int[number / 2 + 1];
        int evenIndex = 0, oddIndex = 0;

        // Loop to separate numbers
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i;
            } else {
                oddNumbers[oddIndex++] = i;
            }
        }

        // Print odd array
        System.out.print("Odd Numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();

        // Print even array
        System.out.print("Even Numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }

        // Close Scanner
        input.close();
    }
}
