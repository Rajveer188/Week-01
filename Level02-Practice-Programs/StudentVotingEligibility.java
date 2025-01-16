//import scanner class
import java.util.Random;
import java.util.Scanner;

// program to check if students can vote or not
public class StudentVotingEligibility {

    //method to generate random age
    public static int[] generateAges(int numberOfStudents){
        //create a array to store age
        int[] ages = new int[numberOfStudents];
        //generate random age
        Random random = new Random();
        for (int i = 0; i < numberOfStudents; i++) {
            ages[i] = random.nextInt(81) + 10;
        }
        return ages;
    }

    //method to check if students can vote or not
    public static String[][] checkVotingEligibility(int[] ages) {
        //2D array to store age and eligibilty
        String[][] eligibility = new String[ages.length][2];
        
        for (int i = 0; i < ages.length; i++) {
            //store age
            eligibility[i][0] = String.valueOf(ages[i]);
            
            //check if age is valid and if student can vote
            if (ages[i] < 0) {
                eligibility[i][1] = "Invalid Age";
            } else if (ages[i] >= 18) {
                eligibility[i][1] = "Can Vote";
            } else {
                eligibility[i][1] = "Cannot Vote";
            }
        }
        //return resultant array
        return eligibility;
    }

    //Method to display the 2D array
    public static void displayEligibility(String[][] eligibility) {
        System.out.println("Age\tEligibility");
        for (String[] row : eligibility){
            System.out.println(row[0] + "\t"+row[1]);
        }
    }

    public static void main(String[] args) {
        int numberOfStudents = 10;

        // Generate random ages for students
        int[] ages = generateAges(numberOfStudents);

        // Check voting eligibility
        String[][] eligibility = checkVotingEligibility(ages);

        // Display the result
        displayEligibility(eligibility);
    }
}
