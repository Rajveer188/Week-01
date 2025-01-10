import java.util.Scanner;

class SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input and result variables
        double total = 0.0;
        double userInput;

        // Loop to sum numbers
        do {
            System.out.print("Enter a number (0 to stop): ");
            userInput = input.nextDouble();
            total += userInput;
        } while (userInput != 0);

        System.out.println("Total sum: " + total);
        input.close();
    }
}
