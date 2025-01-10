import java.util.Scanner;

class NumberSignCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input variable declaration
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check sign of the number
        String result = (number > 0) ? "positive" : (number < 0) ? "negative" : "zero";
        System.out.println("Number: " + number + ", Sign: " + result);

        input.close();
    }
}