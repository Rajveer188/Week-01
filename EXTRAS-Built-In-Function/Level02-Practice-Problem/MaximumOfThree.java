import java.util.Scanner;

public class MaximumOfThree {
    public static void main(String[] args) {
        int num1 = getInput("Enter the first number- ");
        int num2 = getInput("Enter the second number- ");
        int num3 = getInput("Enter the third number- ");
        int max = findMax(num1, num2, num3);
        System.out.println("The maximum number is: " + max);
    }

    //method to get input
    public static int getInput(String message) {
        Scanner input = new Scanner(System.in);
        System.out.print(message);
        return input.nextInt();
    }

    //method to find max of three
    public static int findMax(int a, int b, int c) {
        //find max value among of three
        int max = Math.max(a, Math.max(b, c));
        //return max value
        return max;
    }
}
