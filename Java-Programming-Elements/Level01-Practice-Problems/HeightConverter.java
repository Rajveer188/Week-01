import java.util.Scanner;

class HeightConverter {

    public static void main(String[] args) {
        // Conversion factors
        final double CM_PER_INCH = 2.54;
        final int INCHES_PER_FOOT = 12;

        // Create a Scanner object for input 
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter your height in centimeters: ");
        double heightCm = scanner.nextDouble();

       
            // Total height in inches
            double totalInches = heightCm / CM_PER_INCH;

            // Convert to feet and inches
            int feet = (int) (totalInches / INCHES_PER_FOOT);
            double inches = totalInches % INCHES_PER_FOOT;

            // Output the result
            System.out.printf("Your Height in cm is %.2f while in feet is %d and inches is %.2f\n", heightCm, feet, inches);
        
        
        scanner.close();
        
    }
}
