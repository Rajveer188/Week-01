//importing scanner class
import java.util.Scanner;

class CheckNumbers{
	//main method 
	public static void main(String[] args){
		//Creating object of scanner class
		Scanner input = new Scanner(System.in);
		
		//Define integer array of size 5
		int size = 5;
		int[] array = new int[size];
		
		//input students age using for loop
		System.out.println("Enter 5 numbers");
		for(int i=0; i<array.length; i++){
			array[i] = input.nextInt();
		}
		
		//checking if numbers is positive, negative, odd or even;
		for(int i=0; i<array.length; i++){
            int number = array[i];
			if(number > 0){
				if(number % 2 == 0){
					System.out.println(number + " is even.");
				}else{
					System.out.println(number + " is odd.");
				}
			}else if(number == 0){
				System.out.println(number + " is Zero.");
			}else{
				System.out.println(number + " is Negative.");
			}
		}
		
		//comparing first and last number
		int firstNumber = array[0];
		int lastNumber = array[array.length-1];
		
		if(firstNumber == lastNumber){
			System.out.println(firstNumber + " and " + lastNumber + " is equal.");
		}else if(firstNumber > lastNumber){
		    System.out.println(firstNumber + " is greater than " + lastNumber);
		}else{
			System.out.println(firstNumber + " is less than " + lastNumber);
		}
		
		//Close scanner 
		input.close();
	}
}
