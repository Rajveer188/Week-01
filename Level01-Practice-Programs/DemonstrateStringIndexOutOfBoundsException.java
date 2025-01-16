//import scanner class
import java.util.Scanner;

class DemonstrateStringIndexOutOfBoundsException{
	
	//generate Exception
	public static void generateException(String text){
		//access index beyond the length of string
		int length = text.length();
        text.charAt(length);		
	} 
	
	//generate method to handle expception
	public static void handleException(String text){
		//get length
		int length = text.length();
		try{
			//access index beyond the length of string
            text.charAt(length);	
		}catch(IndexOutOfBoundsException expception){
			System.out.println("Handle expception in method \n"+ expception.getMessage());
		}
	}
	//main method
	public static void main(String[] args){
		//create object of scanner class
		Scanner input = new Scanner(System.in);
		
		//take input
		System.out.println("Enter a text");
		String text = input.nextLine();
		//generate expception
		generateException(text);
		//handle expception
		handleException(text);
		
		//close scanner
		input.close();
	}
}