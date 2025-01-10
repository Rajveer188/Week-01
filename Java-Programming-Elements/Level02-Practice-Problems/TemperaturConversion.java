import java.util.Scanner;
class TemperaturConversion {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter temprature in celsius");
		double celsius = input.nextDouble();
		
		//converting temprature celcius to fahrenheit
		double farenheitResult = (celsius * 9/5 ) + 32;
		
		//Display output
		System.out.println("The " + celsius + " celsius is " + farenheitResult + " fahrenheit");
		
		input.close();
	}
}
