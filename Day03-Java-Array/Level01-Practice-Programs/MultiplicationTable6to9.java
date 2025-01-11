//importing scanner class
import java.util.Scanner;

class MultiplicationTable6to9{
	//main method 
	public static void main(String[] args){
		//Creating object of scanner class
		Scanner input = new Scanner(System.in);
		
		// input number and create an array to store result
		System.out.println("Enter a number");
		int number = input.nextInt();
		int[] multiplicationResult = new int[4];
		
		//performing multiplicationResult
		for(int i=6; i<=9; i++){
		   multiplicationResult[i-6] = number * i;
		}
		// Display result
		for(int i=0; i<4; i++){
		   System.out.println(number + "*" + (6+i) +" = " + multiplicationResult[i]);
		}
		
		
		//Close scanner 
		input.close();
	}
}
