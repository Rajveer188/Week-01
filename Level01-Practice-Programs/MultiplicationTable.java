//importing scanner class
import java.util.Scanner;

class MultiplicationTable{
	//main method 
	public static void main(String[] args){
		//Creating object of scanner class
		Scanner input = new Scanner(System.in);
		
		// input an integer
		System.out.println("Enter a number :");
		int number = input.nextInt();
		
		//Create an array to store result of multiplication
		int size = 10;
		int multiplicationTable[] = new int[10];
		
		for(int i=1; i<=size; i++){
		    multiplicationTable[i-1] = number * i;
	    }
		
		//Display the result 
		for(int i=1; i<=size; i++){
		    System.out.println(number + "*" + i + " = " + multiplicationTable[i-1]);
	    }
		
		//Close scanner 
		input.close();
	}
}
