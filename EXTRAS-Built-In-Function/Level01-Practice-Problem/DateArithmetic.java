import java.time.LocalDate;
import java.util.Scanner;

class DateArithmetic {
    public static void main(String[] args) {
        // create object of scanner class
        Scanner input = new Scanner(System.in);

        //input year, month and day
        System.out.println("enter year, month, day");
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();
        LocalDate date = LocalDate.of(year, month, day);

        // Add 7 days, 1 month, and 2 years
        LocalDate newDate = date.plusDays(7).plusMonths(1).plusYears(2);
        System.out.println("Date after adding- " + newDate);

        // Subtract 3 weeks
        LocalDate finalDate = newDate.minusWeeks(3);
        System.out.println("Date after subtracting 3 weeks- " + finalDate);
    }
}
