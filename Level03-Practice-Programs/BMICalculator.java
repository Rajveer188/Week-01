//import scanner class
import java.util.Scanner;

// program to find the BMI and display the height, weight, BMI
class BMICalculator {
    public static int numberOfPerson = 10;
    //method to calculate BMI and Status
    public static String[][] calculateBMI(double[][] data){
        //2D array to store result after bmi calculation
        String[][] results = new String[numberOfPerson][4];

        for (int i = 0; i < numberOfPerson; i++){
//get weight and height
            double weight = data[i][0];
            double heightInCm = data[i][1];
            //convert height to meters
            double heightInMeters = heightInCm / 100.0;
            //calculate bmi using given formula
            double bmi = weight / (heightInMeters * heightInMeters);

            //determine BMI status
            String status;
            if (bmi <= 18.4) {
                status = "Underweight";
            } else if (bmi <= 24.9) {
                status = "Normal";
            } else if (bmi <= 39.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            // Store result in the result array
            results[i][0] = String.valueOf(heightInCm);
            results[i][1] = String.valueOf(weight);
            results[i][2] = String.valueOf(bmi);
            results[i][3] = status;
        }

        return results;
    }

    //method to display the results
    public static void displayResults(String[][] results) {
        //print statement
        System.out.println("Height\tWeight\tBMI\t\tStatus");
        for (int i = 0; i < numberOfPerson; i++) {
            System.out.println(
                results[i][0] +"\t" +
                results[i][1]+"\t"  +
                results[i][2]+"\t" +
                results[i][3]
            );
        }
    }

    public static void main(String[] args){
//create object of scanner class
        Scanner input = new Scanner(System.in);

        // 2D array to store hieght and weight
        double[][] data = new double[numberOfPerson][2];

        //input weight and height 
        System.out.println("Enter weight and height for 10 members-");
        for (int i = 0; i <numberOfPerson; i++) {
            System.out.println("Member " + (i + 1) + " - Weight - ");
            data[i][0] = input.nextDouble();
            System.out.println("Member " + (i + 1) + " - Height - ");
            data[i][1] = input.nextDouble();
        }

        //Calculate BMI and status
        String[][] results = calculateBMI(data);

        // Display results
        System.out.println("\nBMI Resul-");
        displayResults(results);
        
        //close scanner object
        input.close();
    }
}
