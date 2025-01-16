
//import scanner class
import java.util.Scanner;

// program to check if two texts are anagrams
class AnagramChecker {

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Check if lengths are the same
        if (text1.length() != text2.length()) {
            // not an anagram
            return false;
        }

        // Convert both texts to lowercase
        text1 = text1.toLowerCase();
        text2 = text2.toLowerCase();

        // arrays to store the frequency of characters
        int[] frequency1 = new int[256];
        int[] frequency2 = new int[256];

        // Count the frequency of each character in both texts
        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i)]++;
            frequency2[text2.charAt(i)]++;
        }

        // compare the frequencies of characters in both texts
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }

        // if frequencies match, texts are anagrams
        return true;
    }

    public static void main(String[] args) {
        // create object of scanner class
        Scanner input = new Scanner(System.in);

        // Take user input for two texts
        System.out.println("Enter the first text-");
        String text1 = input.nextLine();

        System.out.println("Enter the second text-");
        String text2 = input.nextLine();

        // Check and display the result
        if (areAnagrams(text1, text2)) {
            System.out.println(text1 + " and " + text2 + " are anagrams");
        } else {
            System.out.println(text1 + " and " + text2 + " are not anagrams");
        }

        input.close();
    }
}
