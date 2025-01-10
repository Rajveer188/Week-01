import java.util.Scanner;
class CalculateIncome{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter salary in INR ");
		double salary = input.nextDouble();
		
		System.out.println("Enter bonus in INR ");
		double bonus = input.nextDouble();
		
		double totalSalary = salary + bonus;
		
		System.out.println("The salary is INR "+ salary + " and bonus is INR " +bonus + ". Hence Total Income is INR " + totalSalary);

        input.close();
	}
}	