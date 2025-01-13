//import scanner class
import java.util.Scanner;

class SimpleInterestCalculator{
	
	//method to calculate simple interest
	private static double calculateSimpleInterest(double principal, double rate, int time){
		//calculate simple interest
		double simpleInterest = (principal * rate * time) / 100;
	    
		//return simple interest
		return simpleInterest;
	}
	//main method
	public static void main(String[] args){
		
		//create object of scanner class
		Scanner input = new Scanner(System.in);
		
		// input principal, rate and time 
		System.out.println("Enter the Principal amount");
        double principal = input.nextDouble();
        System.out.println("Enter the Rate of Interest");
        double rate = input.nextDouble();
        System.out.println("Enter the Time");
        int time = input.nextInt();
		
		//call method to calculate simple interest
		double simpleInterest = calculateSimpleInterest(principal, rate, time);

        //display result
		System.out.println("The simple interest is "+simpleInterest+ " for Principal "+ principal + " rate of interest "+rate +" and time "+ time);
		
		//close scanner
		input.close();
	}
}


