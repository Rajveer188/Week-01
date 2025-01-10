import java.util.Scanner;
class DoubleOpt{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		double a,b,c;
		System.out.println("Enter three number");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		double firstOperation = a + b *c;
		double secondOperation = a * b + c;
		double thirdOperation = c + a / b;
		double forthOperation = a % b + c;
		
		System.out.println("output of operations are " + firstOperation + " " + secondOperation + " " + thirdOperation + " " + forthOperation); 
		
		input.close();
	}
}