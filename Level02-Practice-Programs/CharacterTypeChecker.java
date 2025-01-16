//import scanner class
import java.util.Scanner;

//program to find vowels and consonants in a string and display the character type
class CharacterTypeChecker{
    
    //method to convert character into lowercase
    public static char convertToLowerCase(char charcter){
        //variable to store lowercase character
        char lowerCaseText;
            //check if upercase
            if (charcter >= 'A' && charcter <= 'Z') {
                //convert to lowercase using ASCII value
                lowerCaseText = (char) (charcter + 32);
            } else {
                lowerCaseText =  charcter;
            }
        
        return lowerCaseText;
    }
    //method to check character vowels or consonant
    public static String checkVowelsOrConsonant(char charcter){
        //convert to lowercase
        char lowercaseChar = convertToLowerCase(charcter);

        //check if character is vowel or consonanat
        if (lowercaseChar >= 'a' && lowercaseChar <= 'z') {
            if(lowercaseChar == 'a' || lowercaseChar == 'e' || lowercaseChar == 'i' || lowercaseChar== 'o' || lowercaseChar == 'u') {
                return "Vowel";
            }else{
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }
    //method to find vowels and consonants and return in 2D array
    public static String[][] findCharType(String text){
        //array to store character and type
        int rows = text.length();
        int cols = 2;
        String[][] charAndType = new String[rows][cols];

        //loop to find character type
        for(int i=0; i<text.length(); i++){
            //get current character
            char currentChar = text.charAt(i);
            //store character and type
            charAndType[i][0] = String.valueOf(currentChar);
            charAndType[i][1] = checkVowelsOrConsonant(currentChar);
        }
        //return 2D array
        return charAndType;
    }
    //method to display 2D array
    public static void displayArray(String[][] array) {
        System.out.println("Character\tType");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t"); 
            }
            System.out.println();
        }
    }
    //main method 
    public static void main(String[] args) {
        //create object of scanner class
        Scanner input = new Scanner(System.in);

        //get user input
        System.out.println("Enter a text - ");
        String text = input.nextLine();

        //get character and type using method call
        String[][] charAndType = findCharType(text);
        //display 2D array
        displayArray(charAndType);
        //close scanner
        input.close();
    }
}
