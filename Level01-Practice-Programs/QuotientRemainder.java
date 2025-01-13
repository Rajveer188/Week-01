//import scanner class
import java.util.Scanner;

class QuotientRemainder {

    // Method to find the remainder and quotient
    public static int[] findRemainderAndQuotient(int number, int divisor){
	
        int remainder = number % divisor; 
        int quotient = number / divisor;  
		
        return new int[]{remainder, quotient};
    }
    public static void main(String[] args) {
	    //create scanner object
        Scanner input = new Scanner(System.in);

        //input for two numbers
        System.out.println("Enter the dividend ");
        int number = input.nextInt();

        System.out.println("Enter the divisor ");
        int divisor = input.nextInt();
		
        // call method to find quotient and remainder
        int[] result = findRemainderAndQuotient(number, divisor);

        // Display the results
        System.out.println("Quotient " + result[1]);
        System.out.println("Remainder " + result[0]);
    }
}
