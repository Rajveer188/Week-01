import java.util.Scanner;

public class StudentGradeCalculator {

    // Main method to execute the program
    public static void main(String[] args) {
        
        // Create a scanner object for user input
        Scanner input = new Scanner(System.in);

        // Declare variables for marks in each subject
        double physicsMarks, chemistryMarks, mathsMarks;

        // Input marks for each subject
        System.out.println("Enter the marks for Physics:");
        physicsMarks = input.nextDouble();  // Physics marks

        System.out.println("Enter the marks for Chemistry:");
        chemistryMarks = input.nextDouble();  // Chemistry marks

        System.out.println("Enter the marks for Maths:");
        mathsMarks = input.nextDouble();  // Maths marks

        // Calculate the total marks
        double totalMarks = physicsMarks + chemistryMarks + mathsMarks;

        // Calculate the percentage
        double percentage = (totalMarks / 300) * 100;

        // Declare variables for grade and remarks
        String grade = "";
        String remarks = "";

        // Determine the grade and remarks based on the percentage
        if (percentage >= 80) {
            grade = "A";
            remarks = "Above agency-normalized standards";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "At agency-normalized standards";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Below, but approaching agency-normalized standards";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Well below agency-normalized standards";
        } else if (percentage >= 40) {
            grade = "E";
            remarks = "Too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        // Display all results using a single print statement with newline characters
        System.out.println("Total Marks: " + totalMarks + "\n" + 
                           "Percentage: " + percentage + "%\n" +
                           "Grade: " + grade + "\n" +
                           "Remarks: " + remarks);

        // Close the scanner object to prevent memory leak
        input.close();
    }
}
