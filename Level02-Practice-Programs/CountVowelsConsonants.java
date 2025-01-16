//import scanner class
import java.util.Scanner;

// program to find vowels and consonants  in a string and display the count
class CountVowelsConsonants{
    //method to convert character into lowercase
    public static char convertToLowerCase(char charcter){
        //variable to store lowercase character
        char lowerCaseText;
            //check if upercase
            if (charcter >= 'A' && charcter <= 'Z') {
                //convert to lowercase using ASCII value
                lowerCaseText = (char) (charcter + 32);
            } else {
                lowerCaseText =  charcter;
            }
        
        return lowerCaseText;
    }
    //method to check character vowels or consonant
    public static String checkVowelsOrConsonant(char charcter){
        //convert to lowercase
        char lowercaseChar = convertToLowerCase(charcter);

        //check if character is vowel or consonanat
        if (lowercaseChar >= 'a' && lowercaseChar <= 'z') {
            if(lowercaseChar == 'a' || lowercaseChar == 'e' || lowercaseChar == 'i' || lowercaseChar== 'o' || lowercaseChar == 'u') {
                return "Vowel";
            }else{
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    //method to find count of vowels and consonant
    public static int[] findCount(String text){
        //variable to store count of vowels and consonant
        int vowelsCount = 0;
        int consonanatCount = 0;

        //count numbers of vowels and consonant
        for(int i = 0; i<text.length(); i++){
            //get current character
            char currentChar = text.charAt(i);

            //check character
            String result = checkVowelsOrConsonant(currentChar);
            if(result.equals("Vowel")){
                vowelsCount++;
            }else if(result.equals("Consonant")){
                consonanatCount++;
            }
        }
        //array to store count of vowel and consonant
        int[] array = {vowelsCount, consonanatCount};
        //return result
        return array;
    }

    //method to display the result
    public static void displayResult(int[] countArray){
        //print statement
        System.out.println("Vowels count - "+ countArray[0] + "\nConsonat count - "+countArray[1]);
    }
    //main method 
    public static void main(String[] args) {
        //create object of scanner class
        Scanner input = new Scanner(System.in);

        //get user input
        System.out.println("Enter a text - ");
        String text = input.nextLine();

        //get count of vowels and consonant
        int[] countArray = findCount(text);

        //display result
        displayResult(countArray);
    
        //close scanner
        input.close();
    }
}
