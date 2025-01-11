// Importing Scanner class
import java.util.Scanner;

class GradeCalculator {
    // Main method
    public static void main(String[] args) {
        //create Scanner object
        Scanner input = new Scanner(System.in);

        // Input the number of students
        System.out.println("Enter the number of students");
        int numberOfStudents = input.nextInt();

        //arrays to store marks, percentages, and grades
        int[] physicsMarks = new int[numberOfStudents];
        int[] chemistryMarks = new int[numberOfStudents];
        int[] mathsMarks = new int[numberOfStudents];
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];

        // Input marks
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1));

            System.out.println("Physics");
            int physics = input.nextInt();

            System.out.println("Chemistry");
            int chemistry = input.nextInt();

            System.out.println("Maths");
            int maths = input.nextInt();

            // Validate
            if (physics < 0 || chemistry < 0 || maths < 0) {
                System.out.println("Invalid marks. Please enter positive values.");
                i--;
                continue;
            }

            // Store marks
            physicsMarks[i] = physics;
            chemistryMarks[i] = chemistry;
            mathsMarks[i] = maths;


            // Calculate percentage
            percentages[i] = (physics + chemistry + maths) / 3.0;

            // Determine grade
            if (percentages[i] >= 80) {
                grades[i] = "A (Level 4, above agency-normalized standards)";
            }else if (percentages[i] >= 70) {
                grades[i] = "B (Level 3, at agency-normalized standards)";
            }else if (percentages[i] >= 60) {
                grades[i] = "C (Level 2, below, but approaching agency-normalized standards)";
            }else if(percentages[i] >= 50) {
                grades[i] = "D (Level 1, well below agency-normalized standards)";
            }else if(percentages[i] >= 40) {
                grades[i] = "E (Level 1-, too below agency-normalized standards)";
            }else{
                grades[i] = "R (Remedial standards)";
            }
        }

        // Display results
        System.out.println( "Student " + " Physics "+" Chemistry "+" Maths "+ " Percentage "+"  Grade");
        for (int i = 0; i < numberOfStudents; i++) {
             System.out.println((i + 1) + "   " + physicsMarks[i] + "   " + chemistryMarks[i] + "   " + mathsMarks[i] + "   " + percentages[i] + "   " + grades[i]);
        }

        // Close Scanner
        input.close();
    }
}
