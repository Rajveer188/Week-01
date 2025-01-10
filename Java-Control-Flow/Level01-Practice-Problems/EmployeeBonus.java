import java.util.Scanner;

class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input variables declaration
        System.out.print("Enter salary: ");
        double salary = input.nextDouble();
        System.out.print("Enter years of service: ");
        int years = input.nextInt();

        // Calculate bonus
        double bonus = (years > 5) ? salary * 0.05 : 0.0;
        System.out.println("Salary: " + salary + ", Years: " + years + ", Bonus: " + bonus);
        input.close();
    }
}
