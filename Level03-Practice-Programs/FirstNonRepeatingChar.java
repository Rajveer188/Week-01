//import scanner class
import java.util.Scanner;

// program to find the first non-repeating character in a string
class FirstNonRepeatingChar{

    //method to find the first non-repeating character
    public static char findFirstNonRepeatingCharacter(String text) {
         // Array to store character frequencies
        int size  = 256;
        int[] frequency = new int[size];

        //loop through the text to count the frequency
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            int index = (int)(currentChar);
            frequency[index]++;
        }

        //loop through the text to find the first character with frequency 1
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (frequency[currentChar] == 1) {
                return currentChar;
            }
        }

        return '0'; // Return 0 character if no non-repeating character is found
    }

    //main method
    public static void main(String[] args) {
        // create object of scanner class
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a text");
        String text = input.nextLine();

        //find the first non-repeating character
        char result = findFirstNonRepeatingCharacter(text);

        // Display the result
        if (result != '0') {
            System.out.println("The first non-repeating character is - " + result);
        } else {
            System.out.println("No non-repeating character found");
        }

        // close scanner
        input.close();
    }
}
