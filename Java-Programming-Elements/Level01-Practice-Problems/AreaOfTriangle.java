import java.util.Scanner;

class AreaOfTriangle {

    public static void main(String[] args) {
        // Conversion factors
        final double CM_PER_INCH = 6.4516;

        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        //Input base and height from the user
        System.out.print("Enter base of the triangle in inches: ");
        double baseInInches = scanner.nextDouble();

        System.out.print("Enter  height of the triangle in inches: ");
        double heightInInches = scanner.nextDouble();

        // Calculate the area in square inches
        double areaInSquareInches = 0.5 * baseInInches * heightInInches;

        //Convert area to square centimeters
        double areaInSquareCm = areaInSquareInches * CM_PER_INCH;

        // Display the results
        System.out.println("The area of the triangle is " + areaInSquareInches + " square inches and " + areaInSquareCm + " square centimeters.");


        scanner.close();
    }
}
