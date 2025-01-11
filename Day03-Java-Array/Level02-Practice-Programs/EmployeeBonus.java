// Importing Scanner class
import java.util.Scanner;

class EmployeeBonus {
    // Main method
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        //Create Arrays to store salary and years of service
	    int numberOfEmployees = 10;
        double[] salaries = new double[numberOfEmployees];
        double[] yearsOfService = new double[numberOfEmployees];
        double[] bonusAmount = new double[numberOfEmployees];
        double[] newSalaries = new double[numberOfEmployees];

        double totalBonus = 0;
		double totalOldSalary = 0;
		double totalNewSalary = 0;

        // Input salary and service year
        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("Enter salary for employee " + (i + 1));
            double salary = input.nextDouble();
            System.out.println("Enter years of service for employee " + (i + 1));
            double years = input.nextDouble();

            // check validity of salry and year
            if (salary <= 0 || years < 0) {
                System.out.println("Invalid input. Please enter again");
                i--;
                continue;
            }

            salaries[i] = salary;
            yearsOfService[i] = years;
        }

        // Calculating bonus and new salary
        for (int i = 0; i < numberOfEmployees; i++) {
            double bonus = (yearsOfService[i] > 5) ? salaries[i] * 0.05 : salaries[i] * 0.02;
            bonusAmount[i] = bonus;
            newSalaries[i] = salaries[i] + bonus;

            totalBonus += bonus;
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Display results
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        // Close Scanner
        input.close();
    }
}

