// Program to toggle the case of characters
public class ToggleCase {
    //main method
    public static void main(String[] args) {
        String text = "RajVEer KAjle";
        String toggled = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isUpperCase(ch)) {
                toggled += Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                toggled += Character.toUpperCase(ch);
            } else {
                toggled += ch;
            }
        }

        //print toggeled string
        System.out.println("Toggled String- " + toggled);
    }
}
