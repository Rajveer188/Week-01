import java.util.Scanner;

class MultiplesBelow100 {

    public static void main(String[] args) {
        
        // Create a scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Input for the number
        System.out.println("Enter a number to find its multiples below 100:");
        int number = input.nextInt();
        
        // Loop to find and print multiples of the number below 100
        System.out.println("Multiples of " + number + " below 100 are:");
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {
                System.out.println(i);
            }
        }
        
        input.close();
    }
}
