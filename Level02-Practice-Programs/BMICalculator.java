// Importing Scanner class
import java.util.Scanner;

class BMICalculator {
    // Main method
    public static void main(String[] args) {
        //Create Scanner object
        Scanner input = new Scanner(System.in);

        //input number of person
        System.out.println("Enter the number of persons");
        int numberOfPersons = input.nextInt();

        //creat arays to store weight, height, BMI, and weight status
        double[] weights = new double[numberOfPersons];
        double[] heights = new double[numberOfPersons];
        double[] bmi = new double[numberOfPersons];
        String[] weightStatus = new String[numberOfPersons];

        // Input weight and height for each person
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Enter weight for person " + (i + 1));
            weights[i] = input.nextDouble();

            System.out.println("Enter height for person " + (i + 1));
            heights[i] = input.nextDouble();
        }

        // Calculate BMI and store it
        for (int i = 0; i < numberOfPersons; i++) {
            bmi[i] = weights[i] / (heights[i] * heights[i]); // BMI formula

            if (bmi[i] <= 18.4) {
                weightStatus[i] = "Underweight";
            }else if (bmi[i] <= 24.9) {
                weightStatus[i] = "Normal";
            }else if (bmi[i] <= 39.9) {
                weightStatus[i] = "Overweight";
            }else {
                weightStatus[i] = "Obese";
            }
        }

        // Display the results
        System.out.println("Height(m) " + " Weight(kg) " + " BMI "+" Weight Status");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println(heights[i]+"  "+weights[i]+"  "+bmi[i]+"  "+ weightStatus[i]);
        }

        // Close Scanner
        input.close();
    }
}
