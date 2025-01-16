//import scanner class
import java.util.Scanner;

// program to Find unique characters in a string using charAt() method
public class FindUniqueCharacters{

    //method to find length using user define method
	public static int getLength(String text){
		//variable to store length 
		int length = 0;
		//variable to track index
		int index = 0;
		//infinite loop to find length
		while(true){
			try{
				//get character at index
				text.charAt(index++);
				//increment length by 1
				length++;
			}catch(StringIndexOutOfBoundsException exception){
				//break the loop
				break;
			}
		}
		return length;
	}

    //method to find unique characters in a string
    public static char[] findUniqueCharacter(String text) {
        //get length of the string
        int length = getLength(text);
        //array to store unique character
        char[] uniqueChars = new char[length];
        int index = 0;  // Index to store unique characters
        
        // loop to iterate throw text
        for (int i = 0; i < length; i++){
            //get current character
            char currentChar = text.charAt(i);
            //boolean to check uniquness
            boolean isUnique = true;

            //loop checks if the character is unique by comparing it with previous characters
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            //if the character is unique, store it in array
            if (isUnique) {
                uniqueChars[index++] = currentChar;
            }
        }

        // Create a new array to store the result
        char[] result = new char[index];
        //copy element from uniqueChars to result 
        for (int i = 0; i < index; i++) {
            result[i] = uniqueChars[i];
        }

        //return actual result
        return result;
    }

    //method to print the result
    public static void displayResults(char[] uniqueChars) {
        System.out.print("Unique characters- ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
    }

    //main method
    public static void main(String[] args){
        //create object of scanner class
        Scanner input = new Scanner(System.in);

        // input  the text
        System.out.print("Enter a string - ");
        String text = input.nextLine();

        //find and print the unique characters
        char[] uniqueChars = findUniqueCharacter(text);
        displayResults(uniqueChars);

        //close scanner 
        input.close();
    }
}
