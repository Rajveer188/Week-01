// Simple program to replace a word in a sentence
import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        //crate objec of scanner class
        Scanner input = new Scanner(System.in);

        // Input sentence and words
        System.out.print("Enter the sentence- ");
        String sentence = input.nextLine();
        System.out.print("Enter the word to replace- ");
        String oldWord = input.nextLine();
        System.out.print("Enter the new word- ");
        String newWord = input.nextLine();

        // Replace the word
        String modifiedSentence = sentence.replace(oldWord, newWord);
        //display the result
        System.out.println("Modified Sentence- " + modifiedSentence);
    }
}
