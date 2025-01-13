//import scanner class
import java.util.Scanner;

class BMICalculator {

    //Method to calculate BMI
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double heightInMeters = data[i][1] / 100;
            data[i][2] = data[i][0] / (heightInMeters * heightInMeters);
        }
    }

    // Method to determine BMI status
    public static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            if (data[i][2] <= 18.4) {
                status[i] = "Underweight";
            } else if (data[i][2] >= 18.5 && data[i][2] <= 24.9) {
                status[i] = "Normal";
            } else if (data[i][2] >= 25.0 && data[i][2] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args){
	     //create scanner object
        Scanner scanner = new Scanner(System.in);
		
        double[][] data = new double[10][3];

        //input weight and height
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight for person " + (i + 1));
            data[i][0] = scanner.nextDouble();
            System.out.print("Enter height for person " + (i + 1));
            data[i][1] = scanner.nextDouble();
        }

        // Calculate BMI
        calculateBMI(data);
        String[] status = determineBMIStatus(data);

        // Display results
        System.out.println("\nPerson\tWeight (kg)\tHeight (cm)\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s%n", (i + 1), data[i][0], data[i][1], data[i][2], status[i]);
        }

        scanner.close();
    }
}
