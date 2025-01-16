//import scanner class
import java.util.Scanner;

public class PrimeChecker {
    //main method
    public static void main(String[] args) {
        int number = getInput("Enter a number= ");
        if (isPrime(number)) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }

    //method to get input
    public static int getInput(String message) {
        //create object of scnnaer class
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }

    //method to check if number is prime
    public static boolean isPrime(int num) {
        if (num < 2)
           return false;
    
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) 
                return false;
        }
        return true;
    }
}
