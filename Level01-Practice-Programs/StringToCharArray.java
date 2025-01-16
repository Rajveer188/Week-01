//import scanner class
import java.util.Scanner;

class StringToCharArray{
	
	//method to get character of string using user define method
	public static char[] getCharacterUsingUserMethod(String string){
		
		//get length of string
		int length = string.length();
		//create a array to store character of string
		char[] charArray = new char[length];
		
		//extract each character and store it into array
		for(int i=0; i<length; i++){
			charArray[i] = string.charAt(i);
		}
		//return character array
		return charArray;
	}
	
	//method to get character of string using built in method
	public static char[] getCharacterUsingBuiltInMethod(String string){
		//extract character using built in method and return
		char[] charArray = string.toCharArray();
		
		return charArray;
	}
	
	//method to compare array 
	public static boolean compareArray(char[] userDefineCharacters, char[] builtInCharacters){
		if(userDefineCharacters.length != builtInCharacters.length){
			return false;
		}
		//compare using loop
		for(int i=0; i<userDefineCharacters.length; i++){
			if(userDefineCharacters[i] != builtInCharacters[i]){
                return false;
			}
		}
        return true;
	}

    //method to display char array 
    public static void display(char[] array){
        //get length
        int length = array.length;
		//display array
        for(int i=0; i<length; i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	
	//main method
	public static void main(String[] args){
		//create object of scanner class
		Scanner input = new Scanner(System.in);
		
		//input string from user
		System.out.println("Enter a string ");
		String string = input.next();
		
		//get character of string using user define method
		char[] userDefineCharacters = getCharacterUsingUserMethod(string);
		//get character of string using built in method
		char[] builtInCharacters = getCharacterUsingBuiltInMethod(string);
		
		//compare two arrays 
		boolean isSame = compareArray(userDefineCharacters, builtInCharacters);
		
		//Display result 
		display(userDefineCharacters);
		display(builtInCharacters);
		System.out.println("is both array are same - " + isSame);
		
		//close scanner
		input.close();
	}
}
