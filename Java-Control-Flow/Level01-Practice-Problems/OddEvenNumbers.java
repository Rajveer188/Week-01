import java.util.Scanner;

class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input variable declaration
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        if (number >= 0) {
            for (int i = 1; i <= number; i++) {
                System.out.println("Number: " + i + ", Odd: " + (i % 2 != 0));
            }
        } else {
            System.out.println("Not a natural number");
        }
        input.close();
    }
}