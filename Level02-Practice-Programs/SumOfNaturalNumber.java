//import scanner class
import java.util.Scanner;

class SumOfNaturalNumber {

    //method to calc ulate the sum of n natural numbers using recursio
    public static int sumUsingRecursion(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumUsingRecursion(n - 1);
    }

    //Method to calculate the sum using the formula
    public static int sumUsingFormula(int n) {
        int sum = n * (n + 1) / 2;
		return sum;
    }

    public static void main(String[] args){
		//create scanner object
        Scanner input = new Scanner(System.in);

        //input the number
        System.out.print("Enter a number");
        int n = input.nextInt();

        //validate the input
        if (n <= 0) {
            System.out.println("Please enter a natural number.");
            return;
        }

        //Calculate sums
        int sumRecursion = sumUsingRecursion(n);
        int sumFormula = sumUsingFormula(n);

        // Display results
        if (sumRecursion == sumFormula) {
            System.out.println("Both computations are correct and same. Result = "+sumRecursion);
        } else {
            System.out.println("There is a mismatch in the result, both result is not same");
        }
        
		//close scanner
        input.close();
    }
}
