//import scanner class
import java.util.Scanner;

class CollinearityChecker {

    // Method to check collinearity using the slope formula
    public static boolean arePointsCollinearUsingSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Calculate slopes
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);
        
        // Check if all slopes are equal
        boolean isColliner = slopeAB == slopeBC && slopeBC == slopeAC;

        //return result 
        return isColliner;
    }

    //method to check collinearity using the area of triangle formula
    public static boolean arePointsCollinearUsingArea(int x1, int y1, int x2, int y2, int x3, int y3){
        //calculate the area of the triangle
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        // Check if area is 0 and return 
        return area == 0;
    }

    public static void main(String[] args) {
        //create a Scanner object
        Scanner input = new Scanner(System.in);

        //inputs for the three points
        System.out.print("Enter x1, y1- ");
        int x1 = input.nextInt();
        int y1 = input.nextInt();

        System.out.print("Enter x2, y2- ");
        int x2 = input.nextInt();
        int y2 = input.nextInt();

        System.out.print("Enter x3, y3- ");
        int x3 = input.nextInt();
        int y3 = input.nextInt();

        //display results
        System.out.println("Points A " + x1 + ", " + y1 + "\n B" + x2 + ", " + y2 + "\nC" + x3 + ", " + y3);
        System.out.println("Using Slope Method -" + 
            (arePointsCollinearUsingSlope(x1, y1, x2, y2, x3, y3) ? "Collinear" : "Not Collinear"));
        System.out.println("Using Area Method- " + 
            (arePointsCollinearUsingArea(x1, y1, x2, y2, x3, y3) ? "Collinear" : "Not Collinear"));

        //close scanner class
        input.close();
    }
}
