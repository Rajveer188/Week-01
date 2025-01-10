import java.util.Scanner;
class DivisibleByFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking number from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check divisibility by 5
        boolean isDivisible = number % 5 == 0;
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);

        input.close();
    }
}