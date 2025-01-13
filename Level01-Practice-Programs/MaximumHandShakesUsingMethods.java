//import scanner class
import java.util.Scanner;

class MaximumHandShakesUsingMethods{
	
	//method to calculate handshake
	private static int calculateHandshake(int numberOfStudents){
		//formula to calculate 
		int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
		
		//return 
		return handshakes;
	}
	
	//main method
	public static void main(String[] args){
		
		//create object of scanner class
		Scanner input = new Scanner(System.in);
		
		// Input number of students
        System.out.print("Enter the number of student");
        int numberOfStudents = input.nextInt();
		
		//call method 
		int numberOfHandshake = calculateHandshake(numberOfStudents);
		
		//Display result 
		System.out.println("total number of handshake is "+ numberOfHandshake);
		
		//close scanner
		input.close();
	}
}


