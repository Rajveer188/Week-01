//import scanner class
import java.util.Scanner;

class StudentVoteChecker {

    //method to check if a student can vote
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        }
        return age >= 18;
    }
    
	//main method
    public static void main(String[] args) {
	    //create scanner object
        Scanner input = new Scanner(System.in);
        
		//creat and store age of student
		int size = 10;
        int[] ages = new int[size];
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1));
            ages[i] = input.nextInt();
        }

        for (int i = 0; i < ages.length; i++) {
            System.out.println("Student " + (i + 1) + " age " + ages[i] + " - " +
                    (canStudentVote(ages[i]) ? "Can vote" : "Cannot vote"));
        }
        
		//close scanner
        input.close();
    }
}
