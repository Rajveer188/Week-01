//import scanner class
import java.util.Scanner;

class SmallestAndLargest {

    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = number1;
        int largest = number1;

        //find the smallest
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        }

        //find the largest
        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }
        // return largest and smallest number
        return new int[]{smallest, largest};
    }
	
    //main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the three number ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        
        int[] result = findSmallestAndLargest(number1, number2, number3);

        // Display the results
        System.out.println("Smallest number " + result[0]);
        System.out.println("Largest number " + result[1]);
    }
}
