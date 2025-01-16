import java.util.Scanner;

class FrequencyUsingLoop {

    //method to find the frequency of characters in a string
    public static String[] findCharacterFrequency(String text) {
        // Convert the text to a character array
        char[] characters = text.toCharArray();
        //array to store frequency
        int size = characters.length;
        int[] frequencies = new int[size];

        // first loop to initialize frequencie and find duplicates
        for (int i = 0; i < size; i++) {
            if (characters[i] != '0'){ //skip the character if true
                //initialize frequency to 1
                frequencies[i] = 1;
                //second loop to find duplicate and increase count
                for (int j = i + 1; j < size; j++) {
                    if (characters[i] == characters[j]) {
                        frequencies[i]++;
                        // Mark duplicate character
                        characters[j] = '0';
                    }
                }
            }
        }

        //count unique characters for result array 
        int uniqueCount = 0;
        for (char c : characters) {
            if (c != '0') {
                uniqueCount++;
            }
        }

        // Create the result array
        String[] result = new String[uniqueCount];
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (characters[i] != '0') {
                result[index++] = characters[i] + " - " + frequencies[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
       // create object of scanner class
       Scanner input = new Scanner(System.in);

       //take user input
       System.out.println("Enter a string");
       String text = input.nextLine();

        //find character frequencies
        String[] frequencies = findCharacterFrequency(text);

        //display the result
        System.out.println("Character Frequencies-");
        for (String row : frequencies) {
            System.out.println(row);
        }

        //close scanner
        input.close();
    }
}
