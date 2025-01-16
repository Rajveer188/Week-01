//import scanner class
import java.util.Scanner;

class SubString{
	
	//generate substring using charAt method
	public static String subStringUsingCharAtMethod(String string, int startingIndex, int endingIndex){
		//variable to store sub string
		String subString = "";
		//find substring
		for(int i=startingIndex; i<=endingIndex; i++){
			subString = subString + string.charAt(i);
		}
		//return generated substring
		return subString;
	}
	
	//generate substring using subSting method
    public static String subStringUsingInBuildMethod(String string, int startingIndex, int endingIndex){
		//variable to store sub string and use substring method
		String subSting = string.substring(startingIndex, endingIndex+1);
		
		return subSting;
	}
	//method to compare strings using charAt method
	public static boolean compareUsingCharAt(String firstString, String secondString){
		//get length of both String
		int lengthOfFirstString = firstString.length();
		int lengthOfSecondString = secondString.length();
		
		//check if length are same or not
		if(lengthOfFirstString != lengthOfSecondString){
			return false;
		}
		
		//compare using charAt()
		for(int i=0; i<lengthOfFirstString; i++){
			if(firstString.charAt(i) != secondString.charAt(i)){
			  return false;
			}
		}
		//return true if loop is successfully completed
		return true;
	}
	
	//main method
	public static void main(String[] args){
		//create object of scanner class
		Scanner input = new Scanner(System.in);
		
		//input string from user
		System.out.println("Enter a string ");
		String string = input.next();
		
		//input starting and ending index from user
		System.out.println("Enter a first and last index of substring- ");
		int startingIndex = input.nextInt();
		int endingIndex = input.nextInt();
		
		//get sub string using charAt method
		String subStringCharAt = subStringUsingCharAtMethod(string, startingIndex, endingIndex);
		
		//get sub string using in build subSting method
		String subStringInBuild = subStringUsingInBuildMethod(string, startingIndex, endingIndex);
		
		//check and display if both sub string are same of not
		boolean isSame = compareUsingCharAt(subStringCharAt, subStringInBuild);
		
		System.out.println("sub string using charAt method - "+ subStringCharAt + "\nsub string using subString() method - "+ subStringInBuild);
		
		if(isSame){
			System.out.println("sub string are same using both the method");
		}else{
			System.out.println("sub string are not using both method");
		}
		
		//close scanner
		input.close();
	}
}
