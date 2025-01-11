 // Importing Scanner class
import java.util.Scanner;

class TwoLargestDigitDynamic{
    // Main method
    public static void main(String[] args) {
        //Create Scanner object
        Scanner input = new Scanner(System.in);

        //Input number
        System.out.println("Enter a number:");
        int number = input.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        while (number != 0) {
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp;
            }
            digits[index++] = number % 10;
            number /= 10;
        }

        // Find largest and second larg digit
        int firstLargest = 0, secondLargest = 0;
        for(int i = 0; i < index; i++){
            if (digits[i] >firstLargest) {
                secondLargest = firstLargest;
                firstLargest = digits[i];
            }else if(digits[i] > secondLargest && digits[i] != firstLargest) {
                secondLargest = digits[i];
            }
        }

        // Display results
        System.out.println("Largest Digit: " + firstLargest+ "\nSecond Largest Digit: " + secondLargest);
      
        input.close();
    }
}
