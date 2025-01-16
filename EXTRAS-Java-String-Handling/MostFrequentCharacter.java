// Program to find the most frequent character in a string
public class MostFrequentCharacter {
//main mehod
    public static void main(String[] args) {
        String text = "Rajveer Kajle";
        //array to store frequency
        int[] frequency = new int[256];

        char mostFrequent = ' ';
        //variable to store max count 
        int maxCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
            if (frequency[ch] > maxCount) {
                maxCount = frequency[ch];
                mostFrequent = ch;
            }
        }
        //display result
        System.out.println("Most Frequent Character- " + mostFrequent);
    }
}
