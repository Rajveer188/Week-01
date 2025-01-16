//import scanner class
import java.util.Scanner;

//program to find the frequency of characters in a string using charAt() method
class FrequencyUsingCharAt {

    //method to find the frequency of characters in text
    public static String[][] findCharacterFrequency(String text) {
        //array to store frequency of characters 
        int size = 256;
        int[] frequency = new int[size];

        //count the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            int index = (int)(currentChar);
            frequency[index]++;
        }

        //calculate the number of characters
        int charCount = 0;
        for (int i = 0; i < 256; i++){
            if (frequency[i] > 0) {
                charCount++;
            }
        }

        //create a 2D array to store characters and frequencies
        String[][] result = new String[charCount][2];
        int index = 0;
        //iterate throw loop and store character and frequency in array
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                // Store character and frequency
                result[index][0] = String.valueOf((char) i);
                result[index][1] = String.valueOf(frequency[i]);
                index++;
            }
        }
        //return 2D array
        return result;
    }

    public static void main(String[] args) {
         // create object of scanner class
         Scanner input = new Scanner(System.in);

         // Take user input
         System.out.println("Enter a string");
         String text = input.nextLine();

        //get character frequencies
        String[][] frequencies = findCharacterFrequency(text);

        //display the result
        System.out.println("Character Frequencies-");
        for (String[] row : frequencies) {
            System.out.println("Character- " + row[0] + ", Frequency- " + row[1]);
        }

        //close scanner
        input.close();
    }
}
