// Program to remove a specific character from a string
class RemoveCharacter {
    //main method
    public static void main(String[] args) {
        String input = "Rajveer Kajle";
        char toRemove = 'a';
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch != toRemove) {
                result += ch;
            }
        }

        //display result
        System.out.println("Modified String - " + result);
    }
}
