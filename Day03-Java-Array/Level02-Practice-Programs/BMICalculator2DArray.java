// Importing Scanner class
import java.util.Scanner;

class BMICalculator2DArray {
    // Main method
    public static void main(String[] args) {
        //create Scanner object
        Scanner input = new Scanner(System.in);

        // Input number of persons
        System.out.println("Enter the number of person");
        int numberOfPersons = input.nextInt();

        // 2D array to store height, weight, and BMI
        double[][] personData = new double[numberOfPersons][3];
        // Array to store weight status
        String[] weightStatus = new String[numberOfPersons];

        // Input weight and height for each person
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Enter weight for person " + (i + 1));
            double weight = input.nextDouble();

            System.out.println("Enter height for person " + (i + 1));
            double height = input.nextDouble();

            // Store weight and height
            personData[i][0] = weight;
            personData[i][1] = height;

            //calculate and store BMI
            personData[i][2] = weight / (height * height);

            //weight status
            double bmi = personData[i][2];
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display results
        System.out.println("Height(m) " + " Weight(kg) " + " BMI "+" Weight Status");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println(personData[i][1]+"   "+ personData[i][0]+"   "+personData[i][2]+"   "+weightStatus[i]);
        }

        // Close Scanner
        input.close();
    }
}
