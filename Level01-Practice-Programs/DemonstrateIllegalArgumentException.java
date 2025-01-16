//import scanner class
import java.util.Scanner;

//program to demonstrate IllegalArgumentException
class DemonstrateIllegalArgumentException {
    //generate Exception
	public static void generateException(String text){
        // generating exception 
        System.out.println("generated exception -");
        String subString = text.substring(2s, 1);
	}
	//handle Exception
	public static void handleException(String text){

		//handle exception using try-catch
		try{
			String subString = text.substring(2, 1);		
		}catch(IllegalArgumentException exception){
			System.out.println("Handle exception in try-catch block \n"+exception.getMessage());
		}
	}
	
	//main method
	public static void main(String[] args){
		//create object of scanner class
		Scanner input = new Scanner(System.in);
		
		//take input
		System.out.println("Enter a text");
		String text = input.next();

		//generate exception
		generateException(text);

		//handle exception
		handleException(text);

		//close scanner
		input.close();
	}
}
