// Program to reverse a string without built-in reverse functions
public class ReverseString {
    public static void main(String[] args) {
        String input = "Rajveer kajle";
        String reversed = "";

        //reverse string using loop 
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        //display reversed string
        System.out.println("Reversed String- " + reversed);
    }
}
