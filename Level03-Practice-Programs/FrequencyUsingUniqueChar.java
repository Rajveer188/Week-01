//import scanner class
import java.util.Scanner;

// program to find the frequency of characters in a string using unique characters
class FrequencyUsingUniqueChar {

    // method to find unique characters in a string
    public static char[] uniqueCharacters(String text) {
        // get length of the string
        int length = text.length();
        // array to store unique character
        char[] uniqueChars = new char[length];
        int index = 0; // Index to store unique characters

        // loop to iterate throw text
        for (int i = 0; i < length; i++) {
            // get current character
            char currentChar = text.charAt(i);
            // boolean to check uniquness
            boolean isUnique = true;

            // loop checks if the character is unique by comparing it with previous
            // characters
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // if the character is unique, store it in array
            if (isUnique) {
                uniqueChars[index++] = currentChar;
            }
        }

        // Create a new array to store the result
        char[] result = new char[index];
        // copy element from uniqueChars to result
        for (int i = 0; i < index; i++) {
            result[i] = uniqueChars[i];
        }

        // return actual result
        return result;
    }

    // Method to find the frequency of characters in the string
    public static String[][] findCharacterFrequency(String text) {
        int textLength = text.length();
        //array to store frequency of characters 
        int size = 256;
        int[] frequency = new int[size];
        
        // Calculate frequency of each character
        for (int i = 0; i < textLength; i++) {
            frequency[text.charAt(i)]++;
        }
        
        //get unique characters
        char[] uniqueChars = uniqueCharacters(text);
        //2D array to store unique characters and frequencies
        String[][] result = new String[uniqueChars.length][2];
        
        //sore the unique characters and their frequencies in 2D array
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]);
        }
        
        return result;
    }

    // Method to print the result in a readable format
    public static void displayResults(String[][] result) {
        System.out.println("Character Frequency - ");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + " - " + result[i][1]);
        }
    }

    public static void main(String[] args) {
        // create object of scanner class
         Scanner input = new Scanner(System.in);

         //take user input
         System.out.println("Enter a string");
         String text = input.nextLine();
        
        //find the frequency of characters
        String[][] characterFrequency = findCharacterFrequency(text);
        
        //displya the frequency of characters
        displayResults(characterFrequency);
        
        //close scanner
        input.close();
    }
}
