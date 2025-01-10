import java.util.Scanner;

class SideOfSquare{
	public static void main(String[] args){
		//Create object of scanner
		Scanner input = new Scanner(System.in);
		
		//Taking perimeter of square from user
		System.out.println("Enter perimeter of square :");
		double perimeter = input.nextDouble();
		
		//perimeter = 4 * side;
		int factorToCalculateSide = 4;
		
		//Calculating side of square
		double side = perimeter / factorToCalculateSide;
		//Display Result
		System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
		
		//Close Scanner
		input.close();
	}
}
		