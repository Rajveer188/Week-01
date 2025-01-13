//import scanner class
import java.util.Scanner;

class SumOfNaturalNumber{
	
	//method to calculate sum
	private static int calculateSum(int number){
		int sum = 0;
		for(int i=1; i<=number; i++){
			sum += i;
		}
		
		return sum;
	}
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input number
        System.out.print("Enter a number ");
        int number = input.nextInt();

        int sum = calculateSum(number);
		
		//display result
		System.out.println("sum of natural numbers upto "+ number + " is "+ sum);
		
        input.close();
    }
}