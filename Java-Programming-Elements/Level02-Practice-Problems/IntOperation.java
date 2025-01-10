import java.util.Scanner;
class IntOperation{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int a,b,c;
		System.out.println("Enter three number");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		int firstOperation = a + b *c;
		int secondOperation = a * b + c;
		int thirdOperation = c + a / b;
		int forthOperation = a % b + c;
		
		System.out.println("output of operations are " + firstOperation + " " + secondOperation + " " + thirdOperation + " " + forthOperation); 
		
		input.close();
	}
}