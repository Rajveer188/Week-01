//import scanner class
import java.util.Scanner;

class Factors{

    //Method to find the factors of a number and return them as an array
    public static int[] findFactors(int number) {
        int count = 0;

        //count the factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Initialize the array
        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    //Method to calculate the sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    //Method to calculate product of factors
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    //method to calculate sum of squares of factors
    public static int sumOfSquaresOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += Math.pow(factor, 2);
        }
        return sum;
    }

    public static void main(String[] args){
		 //create scanner object
        Scanner input = new Scanner(System.in);

        //input number
        System.out.print("Enter a number");
        int number = input.nextInt();

        //factors of the number
        int[] factors = findFactors(number);

        // Display the factors
        System.out.print("Factors ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        //sum of factors
        int sum = sumOfFactors(factors);
        System.out.println("Sum of Factors " + sum);

        //product of factors
        int product = productOfFactors(factors);
        System.out.println("Product of Factors " + product);

        //sum of squares of factors
        int sumOfSquares = sumOfSquaresOfFactors(factors);
        System.out.println("Sum of Squares of Factors " + sumOfSquares);
         
		//close scanner 
        input.close();
    }
}
