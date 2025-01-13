
//import scanner class
import java.util.Scanner;

public class ChocolateDistribution 
{   
    public static int[] findRemainderAndQuotient(int number, int divisor) 
    {
        int remainder = number % divisor;
        int quotient = number / divisor;
		
        return new int[]{remainder, quotient};
    }
    public static void main(String[] args) 
    {
	     //create scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of chocolate ");
        int numberOfChocolates = input.nextInt();
        System.out.print("Enter number of children");
        int numberOfChildren = input.nextInt();

        // cal method
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        System.out.println("each children get " + result[1] + " chocolates");
        System.out.println("Remaining chocolates " + result[0]);
    }
}
