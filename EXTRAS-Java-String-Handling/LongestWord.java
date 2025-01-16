// Program to find the longest word in a sentence
public class LongestWord {
    //main method
    public static void main(String[] args) {
        String sentence = "Rajveer kajle";
        String[] words = sentence.split(" ");
        String longestWord = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }

        //displayy longesst word
        System.out.println("Longest Word: " + longestWord);
    }
}
