//importing scanner class
import java.util.Scanner;

class StoreNumbersInArray{
	//main method 
	public static void main(String[] args){
		//Creating object of scanner class
		Scanner input = new Scanner(System.in);
		
		//declare an array and other variable
		double[] array = new double[10];
		double total = 0.0;
		int index = 0;
		
		//variable to store user input
		System.out.println("enter 0 or negative number to stop you can enter only 10 number");
		while(true){
			double userInput = input.nextDouble();
            if (userInput <= 0) {
                break;
            }
            if (index >= 10) {
                System.out.println("You have reached maximum limit of 10 numbers.");
                break; 
            }
            array[index++] = userInput; 
		}
		
		for(int i=0; i<index; i++){
			total += array[i];
		}
		
		//Display the result 
		System.out.println("Total of input number is " + total);
				
		
		
		//Close scanner 
		input.close();
	}
}


