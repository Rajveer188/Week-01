//import scanner class
import java.util.Scanner;

class CheckLeapYear {

    // Method to check leap year
    public static boolean isLeapYear(int year) {
        if (year >= 1582) {
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }
        return false; 
    }

    public static void main(String[] args) {
	     //create scanner object
        Scanner input = new Scanner(System.in);

        //input for the year
        System.out.print("Enter a year ");
        int year = input.nextInt();

        // call method 
		boolean leapYear = isLeapYear(year);
        //display result
        if (leapYear) {
            System.out.println("year " + year + " is a Leap Year.");
        } else {
            System.out.println("year " + year + " is NOT a Leap Year.");
        }

        //close scanner
        input.close();
    }
}
