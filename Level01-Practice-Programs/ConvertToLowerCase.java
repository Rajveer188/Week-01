//import scanner class
import java.util.Scanner;

//program to convert the complete text to lowercase and compare the results
class ConvertToLowerCase {

    //method to convert text to lowercase
    public static String convertToLowerCase(String text){
        //variable to store lowercase text
        String lowerCaseText = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            //check if uppercase
            if (ch >= 'A' && ch <= 'Z') {
                //convert to lowercase using ASCII value
                lowerCaseText = lowerCaseText + (char) (ch + 32);
            } else {
                lowerCaseText = lowerCaseText + ch;
            }
        }
        return lowerCaseText;
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

        //lowercase using user define method
        String lowerCaseUsingUser = convertToLowerCase(text);
        //lowercase using built in method
        String lowerCaseUsingBuiltIn = text.toLowerCase();

        //comparing string
        boolean isEqual = compareStrings(lowerCaseUsingUser, lowerCaseUsingBuiltIn);

        // Display the results
        System.out.println("lowercase using user define method - " + lowerCaseUsingUser + 
                           "\nlowercase using built in method- "+ lowerCaseUsingBuiltIn + 
                           "\n is both string same - "+isEqual);
        //close scanner
        input.close();
    }
}