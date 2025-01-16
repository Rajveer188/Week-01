// Program to remove duplicate characters from a string
public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "it's me, Rajveer";
        //string to store result
        String result = "";
        boolean[] seen = new boolean[256];

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!seen[ch]) {
                result = result + ch;
                seen[ch] = true;
            }
        }

        //display result
        System.out.println("Modified String- " + result);
    }
}
