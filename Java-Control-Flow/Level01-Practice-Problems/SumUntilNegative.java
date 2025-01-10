import java.util.Scanner;

class SumUntilNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input and result variables
        double total = 0.0;

        // Infinite loop
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double userInput = input.nextDouble();
            if (userInput <= 0) {
                break;
            }
            total += userInput;
        }

        System.out.println("Total sum: " + total);
        input.close();
    }
}