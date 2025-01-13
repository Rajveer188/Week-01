//import scanner class
import java.util.Scanner;

class CheckNumbers{
	private static int checkNumber(int number){
		if(number > 0)
			return 1;
		else if(number < 0)
			return -1;
		else 
			return 0;
	}
	
	//main method
	public static void main(String[] args){
		
		//create object of scanner class
		Scanner input = new Scanner(System.in);
		
		//input number
		System.out.println("enter a number");
		int number = input.nextInt();
		
		//Display result 
		int result = checkNumber(number);
		if(result == 1){
			System.out.println("Number is positive");
		}else if(result == -1){
			System.out.println("Number is Negative");
		}else{
			System.out.println("Number is Zero");
		}
		
		//close scanner
		input.close();
	}
}


