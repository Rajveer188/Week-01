import java.util.Scanner;

class SumNaturalFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input variable declaration
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        if (number >= 0) {
            int sum = 0;
            for (int i = 1; i <= number; i++) {
                sum += i;
            }
            int formulaSum = number * (number + 1) / 2;
            System.out.println("For loop sum: " + sum + ", Formula sum: " + formulaSum);
        } else {
            System.out.println("Not a natural number");
        }
        input.close();
    }
}
