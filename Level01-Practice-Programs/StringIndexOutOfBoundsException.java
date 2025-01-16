//import scanner class
import java.util.Scanner;

class StringIndexOutOfBoundsException{
	
	//generate Exception
	public static void generateException(String text){
		//access index beyond the length of string
		int length = text.length();

		System.out.println("Exception -");
        text.charAt(length);		
	}
	//handle Exception
	public static void handleException(String text){
		//get length
		int length = text.length();

		//handle exception using try-catch
		try{
			text.charAt(length);		
		}catch(IndexOutOfBoundsException exception){
			System.out.println("Handle exception in try-catch block \n"+exception.getMessage());
		}
	}
	
	//main method
	public static void main(String[] args){
		//create object of scanner class
		Scanner input = new Scanner(System.in);
		
		//take input
		System.out.println("Enter a text");
		String text = input.nextLine();

		//generate exception
		generateException(text);

		//handle exception
		handleException(text);

		//close scanner
		input.close();
	}
}