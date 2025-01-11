//importing Scanner class
import java.util.Scanner;

class FrequencyOfDigit {
    //Main method
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        //input number
        System.out.println("Enter a number");
        int number = input.nextInt();

        // Count and store digits
        int temp = number;
        int digitCount = 0;
        while (temp != 0) {
            digitCount++;
            temp /= 10;
        }

        int[] digits = new int[digitCount];
        temp = number;
        int index = 0;
        while (temp != 0) {
            digits[index++] = temp % 10;
            temp /= 10;
        }

        int[] frequency = new int[10];
        for (int i = 0; i < digitCount; i++) {
            frequency[digits[i]]++;
        }

        // Display frequency of each digit
        System.out.println("Digit frequencies");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " " + frequency[i]);
            }
        }

        // Close Scanner
        input.close();
    }
}
