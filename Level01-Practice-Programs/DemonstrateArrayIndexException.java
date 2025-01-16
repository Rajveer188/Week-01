//import scanner class
import java.util.Scanner;

//program to demonstrate ArrayIndexOutOfBoundsException
class DemonstrateArrayIndexException {
    
     //generate Exception
	public static void generateException(String[] names){
		//try to generate exception by access index larger than size of array
        int length = names.length;
        String name = names[length];
	} 
	
	//generate method to handle expception
	public static void handleException(String[] names){

        //get length of array
        int length = names.length;
        //HANDLE exception using try-catch
		try{
			String name = names[length];
		}catch(ArrayIndexOutOfBoundsException expception){
			System.out.println("Handle expception in method \n"+ expception.getMessage());
		}
	}
    //main method
	public static void main(String[] args){
		//create object of scanner class
		Scanner input = new Scanner(System.in);
		
		//create array to store names
        int size = 5;
        String[] names = new String[size];

        //take input
		System.out.println("Enter a name of 5 person");
		for(int i=0; i<size; i++){
            names[i] = input.next();
        }
		//generate expception
		generateException(names);
        
		//handle expception
		handleException(names);
		
		//close scanner
		input.close();
	}
}
