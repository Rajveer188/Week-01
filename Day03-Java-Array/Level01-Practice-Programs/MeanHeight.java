//importing scanner class
import java.util.Scanner;

class MeanHeight{
	//main method 
	public static void main(String[] args){
		//Creating object of scanner class
		Scanner input = new Scanner(System.in);
		
		//array to store heights of players
		int numbersOfPlayers = 11;
		double[] heights = new double[numbersOfPlayers];
		
		//input heights of players and calculating sum
		double totalSum = 0.0;
		System.out.println("enter heights of 11 players");
		for(int i=0; i<heights.length; i++){
			heights[i] = input.nextDouble();
			//calculating sum
			totalSum += heights[i];
		}
		double meanValue = totalSum / numbersOfPlayers;
		
		System.out.println("The mean value of players heights is : "+ meanValue);
		
		//Close scanner 
		input.close();
	}
}
