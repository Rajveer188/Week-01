// Program to count vowels and consonants in a string
public class CountVowelsConsonants {
//main method
    public static void main(String[] args) {
        String input = "Hey it's me Rajveer";
        int vowels = 0, consonants = 0;

        for (char ch : input.toLowerCase().toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        //display result
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
