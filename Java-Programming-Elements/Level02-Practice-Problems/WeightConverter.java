import java.util.Scanner;

class WeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input for weight in pounds
        System.out.println("Enter the weight in pounds: ");
        double weightInPounds = input.nextDouble();

        // Convert pounds to kilograms
		double conversionFactor = 2.2;
        double weightInKilograms = weightInPounds * conversionFactor;

        // Output the result
        System.out.println("The weight of the person in pounds is " + weightInPounds + " and in kg is " + weightInKilograms + ".");
		input.close();
    }
}
