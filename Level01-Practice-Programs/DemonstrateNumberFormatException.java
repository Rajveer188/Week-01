//import scanner class
import java.util.Scanner;

//program to demonstrate NumberFormatException
class DemonstrateNumberFormatException {
    //generate Exception
	public static void generateException(String text){
		//try to generate number formate exception
        int number = Integer.parseInt(text);
	} 
	
	//generate method to handle expception
	public static void handleException(String text){
        //HANDLE exception using try-catch
		try{
			int number = Integer.parseInt(text);	
		}catch(NumberFormatException expception){
			System.out.println("Handle expception in method \n"+ expception.getMessage());
		}
	}
	//main method
	public static void main(String[] args){
		//create object of scanner class
		Scanner input = new Scanner(System.in);
		
		//take input
		System.out.println("Enter a text");
		String text = input.next();
		//generate expception
		generateException(text);
        
		//handle expception
		handleException(text);
		
		//close scanner
		input.close();
	}
}