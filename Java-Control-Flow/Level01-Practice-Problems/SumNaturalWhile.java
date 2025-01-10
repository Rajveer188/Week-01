import java.util.Scanner;

class SumNaturalWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input variable declaration
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        if (number >= 0) {
            int sum = 0;
            int i = 1;
            while (i <= number) {
                sum += i;
                i++;
            }
            int formulaSum = number * (number + 1) / 2;
            System.out.println("While loop sum: " + sum + ", Formula sum: " + formulaSum);
        } else {
            System.out.println("Not a natural number");
        }
        input.close();
    }
}