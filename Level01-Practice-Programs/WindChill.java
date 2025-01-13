//import scanner class
import java.util.Scanner;

public class WindChill {
    
	//method to calculate wild chill
    public static double calculateWindChill(double temperature, double windSpeed) {
	
        double wildChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
		return wildChill;
    }
	
	//main method
    public static void main(String[] args) {
	    //create scanner object
        Scanner input = new Scanner(System.in);
		
		//input temperature and wind speed
        System.out.print("Enter temperature");
        double temperature = input.nextDouble();
        System.out.print("Enter wind speed");
        double windSpeed = input.nextDouble();
        
		//method call
        double windChill = calculateWindChill(temperature, windSpeed);
        System.out.println("wind chill temperature is " + windChill);
    }
}
