import java.util.Scanner;

class SwapNumbers{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two numbers to swap");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
		//swaping numbers using arithmetic operations
		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;
		
		//Display result
		System.out.println("The swapped numbers are " + number1 + " and " + number2);
		
		input.close();
	}
}