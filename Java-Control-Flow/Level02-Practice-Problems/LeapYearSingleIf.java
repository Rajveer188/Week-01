import java.util.Scanner;

class LeapYearSingleIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input variable declaration
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Check Gregorian calendar year
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println("Year: " + year + " is a Leap Year.");
        } else if (year >= 1582) {
            System.out.println("Year: " + year + " is not a Leap Year.");
        } else {
            System.out.println("Year: " + year + " is not in the Gregorian calendar.");
        }

        input.close();
    }
}