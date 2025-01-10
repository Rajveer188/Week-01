import java.util.Scanner;

class TriangleParkRun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input for the three sides of the triangular park
        System.out.println("Enter the length of side 1 in meters: ");
        double side1 = input.nextDouble();
        System.out.println("Enter the length of side 2 in meters: ");
        double side2 = input.nextDouble();
        System.out.println("Enter the length of side 3 in meters : ");
        double side3 = input.nextDouble();

        // Calculate the perimeter of the triangle
        double perimeter = side1 + side2 + side3;

        // Total distance to run in meters (5 km = 5000 meters)
        double totalDistance = 5000;

        // Calculate the number of rounds
        int rounds = (int) Math.ceil(totalDistance / perimeter);

        // Output the result
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km.");
        input.close();
    }
}
