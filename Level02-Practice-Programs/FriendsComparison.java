//import scanner class
import java.util.Scanner;

class FriendsComparison{

    //Method to find the youngest friend
    public static String findYoungest(String[] names, int[] ages) {
        int minAge = ages[0];
        String youngest = names[0];
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngest = names[i];
            }
        }
        return youngest;
    }

    //method to find the tallest friend
    public static String findTallest(String[] names, int[] heights) {
        int maxHeight = heights[0];
        String tallest = names[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallest = names[i];
            }
        }
        return tallest;
    }

    public static void main(String[] args){
	     //create scanner object
        Scanner input = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        int[] heights = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i]);
            ages[i] = input.nextInt();
            System.out.print("Enter height of " + names[i]);
            heights[i] = input.nextInt();
        }
       
	    //display result
        System.out.println("Youngest " + findYoungest(names, ages));
        System.out.println("Tallest " + findTallest(names, heights));
        
		//close scanner 
        input.close();
    }
}
