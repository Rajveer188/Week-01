//import scanner class
import java.util.Scanner;

class CompareTwoString{
	
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
	
	//method to compare strings using equals method
	public static boolean compareUsingEquals(String firstString, String secondString){
		//use equals method
		boolean isEqual = firstString.equals(secondString);
		
		//return result
	return isEqual;
	}	
	
	//main method
	public static void main(String[] args){
		//create object of scanner class
		Scanner input = new Scanner(System.in);
		
		//input two string
		System.out.println("Enter two string to compare");
		String firstString = input.next();
		String secondString = input.next();
		
		//compare string using charAt() method
		boolean resultUsingCharAt = compareUsingCharAt(firstString, secondString);
		
		//compare using equals method
		boolean resultUsingEquals = compareUsingEquals(firstString, secondString);
		
		//check if both result are same or not and display result
		if(resultUsingCharAt == resultUsingEquals){
			System.out.print("Result are same using both method ");
			if(resultUsingCharAt){
				System.out.println("and string are same");
			}else{
				System.out.println("and string are not same");
			}
		}else{
			System.out.println("Result are same using both method");
		}
		
		//close scanner
		input.close();
	}
}
			
		