//import scanner class
import java.util.Scanner;

public class NumberGuessingGame {
    //main method
    public static void main(String[] args) {
        //create object of scanner class
        Scanner input = new Scanner(System.in);
        int low = 1, high = 100;
        boolean correct = false;

        System.out.println("think a number between 1 and 100");

        while (!correct) {
            int guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "? (Enter 'high', 'low', or 'correct')");
            String feedback = input.nextLine().toLowerCase();

            if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else if (feedback.equals("correct")) {
                System.out.println("I guessed your number.");
                correct = true;
            } else {
                System.out.println("Invalid input. Please enter 'high', 'low', or 'correct'.");
            }
        }

        //close scanner
        input.close();
    }

    public static int generateGuess(int low, int high) {
        //generate and return a random number
        int randomNumber =  low + (int) (Math.random() * (high - low + 1));
        return randomNumber;
    }
}
