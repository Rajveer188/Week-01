//program to demonstrate NullPointerException
class DemonstrateNullPointerException{
    
    //generate Exception
	public static void generateException(){
        //define and initialize text variable
        String text = null;
		
        //generate exception using call a method of string
        System.out.println("Exception -");
        text.charAt(0);		
	}
	//handle Exception
	public static void handleException(){
		//define and initialize text variable
        String text = null;
		
       
		//handle exception using try-catch
		try{
			text.charAt(0);	
		}catch(NullPointerException exception){
			System.out.println("Handle exception in try-catch block \n"+exception.getMessage());
		}
	}
    //main method
	public static void main(String[] args){

		//generate exception
		generateException();

		//handle exception
		handleException();

	}
}