import java.util.Scanner;
class DistanceConverter {

    public static void main(String[] args) {
        // Conversion factors
        final int FEET_PER_YARD = 3;
        final int YARDS_PER_MILE = 1760;

        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Input distance in feet from the user
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = scanner.nextDouble();

        // Convert to yards and miles
        double distanceInYards = distanceInFeet / FEET_PER_YARD;
        double distanceInMiles = distanceInYards / YARDS_PER_MILE;

        // Output the results
        System.out.println("The distance in yards is " + distanceInYards + " and in miles is " + distanceInMiles );

        scanner.close();
    }
}
