//import scanner class
import java.util.Scanner;

//program to split the text into words and compare
class SplitTextIntoWords{

    //method to find length using user define method
	public static int findLength(String text){
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
				break;
			}
		}
		return length;
	}

    //Method to split text into words
    public static String[] splitTextIntoWords(String text) {
        // count the number of spaces to find numbers of  words.
        int spaceCount = 0;
        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        //create array to store the indexes of spaces
        int[] spaceIndexes = new int[spaceCount + 1];
        int index = 0;
        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }

        //add end of the text as the last space index
        spaceIndexes[index] = findLength(text);

       //array to store words
        String[] words = new String[spaceCount + 1];
        int start = 0;
        //extract word using loop and store
        for (int i = 0; i < spaceIndexes.length; i++) {
            int end = spaceIndexes[i];
            words[i] = text.substring(start, end);
            //update start index
            start = end + 1;
        }
        return words;
    }

    //method to compare two String arrays
    public static boolean compareArrays(String[] array1, String[] array2) {
        //loop to compare two arrays
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }

        return true;
    }

    //method to store string array's 
    public static void displayResult(String[] customSplit, String[] builtInSplit, boolean isEqual){
        System.out.println("Custom Split Result ");
        for (String word : customSplit) {
            System.out.print(word+ " ");
        }

        System.out.println("\nBuilt in Split Result ");
        for (String word : builtInSplit) {
            System.out.print(word+" ");
        }

        // Display comparison result
        System.out.println("\nare both results equal - " + isEqual);
    }
    //main method
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //Take input
        System.out.println("Enter a text ");
        String text = input.nextLine();

        //call method to find string length
        int length = findLength(text);

        // Split text using user method
        String[] customSplit = splitTextIntoWords(text);

        // Split text using built in method
        String[] builtInSplit = text.split(" ");

        //compare both arrays
        boolean isEqual = compareArrays(customSplit, builtInSplit);

        // Display Result
       displayResult(customSplit, builtInSplit, isEqual);
       
              //close scanner
              input.close();
           }
}
