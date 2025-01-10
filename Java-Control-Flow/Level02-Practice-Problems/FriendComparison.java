import java.util.Scanner;

public class FriendComparison {

    public static void main(String[] args) {
        
        // Create a scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Input for Amar's age and height
        System.out.println("Enter Amar's age:");
        int amarAge = input.nextInt();
        System.out.println("Enter Amar's height (in cm):");
        int amarHeight = input.nextInt();
        
        // Input for Akbar's age and height
        System.out.println("Enter Akbar's age:");
        int akbarAge = input.nextInt();
        System.out.println("Enter Akbar's height (in cm):");
        int akbarHeight = input.nextInt();
        
        // Input for Anthony's age and height
        System.out.println("Enter Anthony's age:");
        int anthonyAge = input.nextInt();
        System.out.println("Enter Anthony's height (in cm):");
        int anthonyHeight = input.nextInt();
        
        // Find the youngest friend
        int youngestAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        String youngestFriend = (youngestAge == amarAge) ? "Amar" :
                                 (youngestAge == akbarAge) ? "Akbar" : "Anthony";
        
        // Find the tallest friend
        int tallestHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));
        String tallestFriend = (tallestHeight == amarHeight) ? "Amar" :
                               (tallestHeight == akbarHeight) ? "Akbar" : "Anthony";
        
        // Output the results
        System.out.println("The youngest friend is: " + youngestFriend + " with age " + youngestAge);
        System.out.println("The tallest friend is: " + tallestFriend + " with height " + tallestHeight + " cm");

        // Close the scanner object to prevent memory leak
        input.close();
    }
}
