//import scanner class
import java.util.Scanner;

public class TrigonometricFunction {
    
	//method to calculate Trigonometric Function
    public static double[] calculateTrigonometricFunctions(double angle) {
        
		// angle to radian
		double radians = Math.toRadians(angle);
		
		//radian to sine, cosine and tan
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[]{sine, cosine, tangent};
    }
    public static void main(String[] args) {
	    //create scanner object
        Scanner input = new Scanner(System.in);
		
		//input degree
        System.out.print("enter angle");
        double angle = input.nextDouble();

        //call method 
        double[] results = calculateTrigonometricFunctions(angle);
        System.out.println("Sine " + results[0]);
        System.out.println("Cosine " + results[1]);
        System.out.println("Tangent " + results[2]);
    }
}

