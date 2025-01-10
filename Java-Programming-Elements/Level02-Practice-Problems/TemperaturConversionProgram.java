
import java.util.Scanner;
class TemperaturConversionProgram{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter temprature in Fahrenheit ");
		double fahrenheit  = input.nextDouble();
		
		//converting temprature celcius to fahrenheit
		double celsiusResult  = (fahrenheit - 32) * 5/9;
		
		//Display output
		System.out.println("The " + fahrenheit  + " fahrenheit " + celsiusResult + " celcius");
		
		input.close();
	}
}
	