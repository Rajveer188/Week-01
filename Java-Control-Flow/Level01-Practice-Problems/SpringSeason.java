import java.util.Scanner;
class SpringSeason {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input variables declaration
        System.out.print("Enter month: ");
        int month = input.nextInt();
        System.out.print("Enter day: ");
        int day = input.nextInt();

        // Check if it's Spring Season
        boolean isSpring = (month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20);
        System.out.println("Month: " + month + ", Day: " + day + ", Spring Season: " + isSpring);

        input.close();
    }
}