
//import scanner class
import java.util.Scanner;

//program to convert the complete text to uppercase and compare the results
class ConvertToUpperCase {

    //method to convert text to uppercase
    public static String convertToUpperCase(String text){
        //variable to store uppercase text
        String upperCaseText = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            //check if lowercase
            if (ch >= 'a' && ch <= 'z') {
                //convert to uppercase using ASCII value
                upperCaseText = upperCaseText + (char) (ch - 32);
            } else {
                upperCaseText = upperCaseText + ch;
            }
        }
        return upperCaseText;
    }

    //method to compare two strings
    public static boolean compareStrings(String firstString, String secondString) {
        if (firstString.length() != secondString.length()) {
            return false;
        }
        //compare if two string are same
        for (int i = 0; i < firstString.length(); i++) {
            if (firstString.charAt(i) != secondString.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    // main method
    public static void main(String[] args) {
        // create object of scanner class
        Scanner input = new Scanner(System.in);

        // get input
        System.out.println("Enter a text -");
        String text = input.nextLine();

        //uppercase using user define method
        String upperCaseUsingUser = convertToUpperCase(text);
        //uppercase using built in method
        String upperCaseUsingBuiltIn = text.toUpperCase();

        //comparing string
        boolean isEqual = compareStrings(upperCaseUsingUser, upperCaseUsingBuiltIn);

        // Display the results
        System.out.println("Uppercase using user define method - " + upperCaseUsingUser + 
                           "\nuppercase using built in method- "+ upperCaseUsingBuiltIn + 
                           "\n is both string same - "+isEqual);
        //close scanner
        input.close();
    }
}