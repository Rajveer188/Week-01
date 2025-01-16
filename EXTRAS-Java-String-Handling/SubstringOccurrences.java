// Program to count occurrences of a substring in a string
public class SubstringOccurrences {
    public static void main(String[] args) {
        String str = "today is sunday, it's sunday today";
        String sub = "to";
        int count = 0;

        for (int i = 0; i <= str.length() - sub.length(); i++) {
            if (str.substring(i, i + sub.length()).equals(sub)) {
                count++;
            }
        }

        //print occurrences of sub string
        System.out.println("Occurrences- " + count);
    }
}
