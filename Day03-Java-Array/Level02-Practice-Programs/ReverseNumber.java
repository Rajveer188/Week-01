//Importing Scanner class
import java.util.Scanner;

class ReverseNumber {
    // Main method
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Input number
        System.out.println("Enter a number");
        int number = input.nextInt();

        // Count and store digit
        int digitCount = 0, temp = number;
        while (temp != 0) {
            digitCount++;
            temp /= 10;
        }

        int[] digits = new int[digitCount];
        int index = 0;
        while (number != 0) {
            digits[index++] = number % 10;
            number /= 10;
        }

        // Display  in reverse
        System.out.print("Reversed number");
        for (int i = 0; i<digitCount; i++) {
            System.out.print(digits[i]);
        }

        // Close Scanner
        input.close();
    }
}
