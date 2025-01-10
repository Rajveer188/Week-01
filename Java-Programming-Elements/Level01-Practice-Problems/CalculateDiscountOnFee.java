import java.util.Scanner;

class CalculateDiscountOnFee{
	public static void main(String[] args){
		//creating object of scanner class
		Scanner input = new Scanner(System.in);
		
		//taking fee amount from user
		System.out.println("Enter fee amount");
		double fee = input.nextDouble();
		
		//taking discount percent from user
		System.out.println("Enter fee discount percent");
		double discountPercent = input.nextDouble();;
		
		//calculating discount and discounted fee
		double discount = fee * discountPercent / 100;
		double discountedFee = fee - discount;
		
		//Display result
		System.out.println("The discount amount is INR " + discount + " and final discount fee is INR " + discountedFee);
		
		//Close scanner
		input.close();
	}
}
