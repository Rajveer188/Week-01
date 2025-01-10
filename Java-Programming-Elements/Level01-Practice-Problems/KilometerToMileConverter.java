import java.util.Scanner;

public class KilometerToMileConverter {
    public static void main(String[] args) {
     
        // Declare a variable to store the kilometers
        double km;
		
		// Create a Scanner object to read input
        Scanner input = new Scanner(System.in);


        // taking input from user
		System.out.println("enter distance in kilometer");
        km = input.nextDouble();

        // 1 mile = 1.6 kilometers
        double conversionFactor = 1.6;

        // Calculate the distance in miles
        double miles = km / conversionFactor;

        // Display  result
        System.out.printf("The total miles is " +  miles + " for the given " + km +" km");

        // Close the Scanner
        input.close();
    }
}
