// Program to check if a string is a palindrome
public class PalindromeCheck {
    //main method
    public static void main(String[] args) {
        String text = "kanak";
        String reversed = "";

        //reverse string
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        //check and print palindrom
        if (text.equals(reversed)) {
            System.out.println(text+" is a palindrome");
        } else {
            System.out.println(text +" is not a palindrome");
        }
    }
}
