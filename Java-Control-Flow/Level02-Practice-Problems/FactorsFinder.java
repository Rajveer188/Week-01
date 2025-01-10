import java.util.Scanner;

class FactorsFinder {

    public static void main(String[] args) {
        
        //Create a scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Input the number
        System.out.println("Enter a number to find its factors:");
        int number = input.nextInt();
        
        //find and print factors
        System.out.println("Factors of " + number + " are:");
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
        
        //Close the scanner object to prevent memory leak
        input.close();
    }
}
