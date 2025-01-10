import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        
        // Create a scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter weight in kilograms
        System.out.println("Enter your weight in kilograms (kg):");
        double weight = input.nextDouble();  // Weight in kg
        
        // Prompt the user to enter height in centimeters
        System.out.println("Enter your height in centimeters (cm):");
        double heightInCm = input.nextDouble();  // Height in cm
        
        // Convert height from centimeters to meters
        double heightInMeters = heightInCm / 100;
        
        // Calculate BMI using the formula BMI = weight / (height * height)
        double bmi = weight / (heightInMeters * heightInMeters);
        
        // Determine weight status based on BMI
        String status = "";
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            status = "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }
        
        // Output the BMI and the weight status
        System.out.println("Your BMI is: " + bmi);
        System.out.println("Weight Status: " + status);
        
        // Close the scanner object to prevent memory leak
        input.close();
    }
}
