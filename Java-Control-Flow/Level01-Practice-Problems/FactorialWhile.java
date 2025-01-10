import java.util.Scanner;

class FactorialWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input variable declaration
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        if (number >= 0) {
            int factorial = 1;
            int i = 1;
            while (i <= number) {
                factorial *= i;
                i++;
            }
            System.out.println("Factorial: " + factorial);
        } else {
            System.out.println("Not a positive integer");
        }
        input.close();
    }
}