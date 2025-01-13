//import scanner class
import java.util.Scanner;

class TriangleParkRun {
	
	//method to calculate total rounds
	private static int calculateRounds(double perimeter, double totalDistance){
		// Calculate the number of rounds
        int rounds = (int) Math.ceil(totalDistance / perimeter);
		
		return rounds;
	}
	// main method
    public static void main(String[] args) {
	
        Scanner input = new Scanner(System.in);

        // Input three sides of the park
        System.out.println("Enter the length of side 1");
        double side1 = input.nextDouble();
        System.out.println("Enter the length of side 2");
        double side2 = input.nextDouble();
        System.out.println("Enter the length of side 3");
        double side3 = input.nextDouble();
		
		// Calculate the perimeter
        double perimeter = side1 + side2 + side3;

        // Total distance 5 km = 5000 meters
		double totalDistance = 5000;
		
		//call method
		int rounds = calculateRounds(perimeter, totalDistance);

        //display result
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km.");
		
        input.close();
    }
}
