import java.util.Scanner;

class SmallestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input variables declaration
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = input.nextInt();

        // Check if first number is the smallest
        boolean isFirstSmallest = number1 < number2 && number1 < number3;
        System.out.println("Is the first number the smallest? " + isFirstSmallest);

        input.close();
    }
}