import java.util.Scanner;

class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input variable declaration
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if number is natural
        if (number >= 0) {
            int sum = number * (number + 1) / 2;
            System.out.println("Number: " + number + ", Sum of natural numbers: " + sum);
        } else {
            System.out.println("Number: " + number + ", Not a natural number");
        }
        input.close();
    }
}