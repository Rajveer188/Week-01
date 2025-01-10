import java.util.Scanner;

class DayOfWeek {

    public static void main(String[] args) {
        
        //Create a scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Input for month, day, and year
        System.out.println("Enter the month (1-12):");
        int m = input.nextInt();
        System.out.println("Enter the day (1-31):");
        int d = input.nextInt();
        System.out.println("Enter the year:");
        int y = input.nextInt();
        
        // Apply the formula for calculating the day of the week
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;
        
        // Output the day of the week
        System.out.println("The day of the week is: " + d0);
        
        input.close();
    }
}
