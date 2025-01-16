//import random class
import java.util.Random;

// program to  Compute the percentage and then calculate the grade
class StudentGradeCalculator {

    //method to generate random scores
    public static int[][] generateScores(int numberOfStudents) {
        //array to store score
        int[][] scores = new int[numberOfStudents][3];
        //create object of random class
        Random random = new Random();

        for (int i = 0; i < numberOfStudents; i++) {
            //physics score
            scores[i][0] = random.nextInt(101); 
            //chemistry score
            scores[i][1] = random.nextInt(101);
             //Maths score
            scores[i][2] = random.nextInt(101);
        }
        //return 2D array 
        return scores;
    }

    //method to calculate the total, average, and percentage for each student
    public static double[][] calculateScores(int[][] scores, int numberOfStudents){
        //array to store total, average and percentag
        double[][] result = new double[numberOfStudents][3];

        //calculating total, average and percentages
        for (int i = 0; i < numberOfStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            //round decimal upto 2 place
            average = Math.round(average * 100.0) / 100.0;
    percentage = Math.round(percentage * 100.0) / 100.0;
            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }
        //return resultant array
        return result;
    }

    // Method to calculate the grade based on the percentage
    public static String[] calculateGrades(double[][] result, int numberOfStudents) {
        //string array to store grades
        String[] grades = new String[numberOfStudents];

        //calculating grades
        for (int i = 0; i < numberOfStudents; i++) {
            double percentage = result[i][2];
            if (percentage >= 80) {
                grades[i] = "Level 4- above standards";
            } else if (percentage >= 70) {
                grades[i] = "Level 3 - at standards";
            } else if (percentage >= 60) {
                grades[i] = "Level 2 - below but approaching";
            } else if (percentage >= 50) {
                grades[i] = "Level 1 - well below";
            } else if (percentage >= 40) {
                grades[i] = "Level 1 - too below";
            } else {
                grades[i] = "Remidial standars";
            }
        }
        return grades;
    }

    // Method to display the scorecard of all students
    public static void displayScorecard(int[][] scores, double[][] result, String[] grades, int numberOfStudents) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println((i + 1) + "\t" 
                               + scores[i][0] +"\t"
                               + scores[i][1] + "\t\t"
                               + scores[i][2] +"\t"
                               + result[i][0] +"\t" 
                               + result[i][1] +"\t" 
                               + result[i][2] + "\t" 
                               + grades[i]);
        }
    }

    public static void main(String[] args) {
        int numberOfStudents = 10;

        //generate random scores
        int[][] scores = generateScores(numberOfStudents);

        //Calculate total, average, and percentage
        double[][] result = calculateScores(scores, numberOfStudents);

        //calculate grades 
        String[] grades = calculateGrades(result, numberOfStudents);

        //display result
        displayScorecard(scores, result, grades, numberOfStudents);
    }
}
