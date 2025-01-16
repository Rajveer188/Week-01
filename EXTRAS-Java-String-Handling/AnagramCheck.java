// Simple program to check if two strings are anagrams
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        //create object of scanner class
        Scanner input = new Scanner(System.in);

        // Input two strings
        System.out.print("Enter the first string- ");
        String str1 = input.nextLine();
        System.out.print("Enter the second string- ");
        String str2 = input.nextLine();

        //convert string to lower case
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Check lengths
        if (str1.length() != str2.length()) {
            System.out.println("The strings are not anagrams");
            return;
        }

        // Count characters
        int[] count = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }

        // Verify counts
        for (int i = 0; i < 256; i++) {
            if (count[i] != 0) {
                System.out.println("The strings are not anagrams.");
                return;
            }
        }

        System.out.println("The strings are anagrams");
    }
}
