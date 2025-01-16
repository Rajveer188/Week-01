
//import scanner class
import java.util.Scanner;

//program to trim the leading and trailing spaces from a string
class TrimSpaces {

    // method to trim leading and trailing spaces
    public static int[] trimSpaces(String text) {
        // variable to store start and end index
        int startIndex = 0;
        int endIndex = text.length() - 1;

        // get length of string
        int length = text.length();
        // Find the start index (first non-space character)
        while (startIndex < text.length() && text.charAt(startIndex) == ' ') {
            startIndex++;
        }

        // Find the end index (last non-space character)
        while (endIndex >= 0 && text.charAt(endIndex) == ' ') {
            endIndex--;
        }

        // return result as array
        return new int[] { startIndex, endIndex };
    }

    // method to create a substring
    public static String createSubstring(String text, int startIndex, int endIndex) {
        // new string to store sub string
        String subString = "";
        // create a substring
        for (int i = startIndex; i <= endIndex; i++) {
            subString = subString + text.charAt(i);
        }
        return subString;
    }

    // method to compare two String arrays
    public static boolean compareStrings(String str1, String str2) {
        // loop to compare two String
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    // main method
    public static void main(String[] args) {
        // create object of scanner class
        Scanner input = new Scanner(System.in);

        // get user input
        System.out.println("Enter a text - ");
        String text = input.nextLine();

        // get starting and ending index of actual string withou extra space
        int[] stringIndex = trimSpaces(text);
        // trim string using user define method
        String trimedStringUsingCustom = createSubstring(text, stringIndex[0], stringIndex[1]);
        // trim string using built in method
        String trimedStringUsingBuiltIn = text.trim();

        // compare both string
        boolean isSame = compareStrings(trimedStringUsingCustom, trimedStringUsingBuiltIn);

        System.out.println("trimed string using custom method - " + trimedStringUsingCustom +
                "\ntrimed string using built in method - " + trimedStringUsingBuiltIn +
                "\nis both string same - " + isSame);

        // close scanner
        input.close();
    }
}
