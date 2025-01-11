// Importing Scanner class
import java.util.Scanner;

class Copy2DTo1DArray {
    // Main method
    public static void main(String[] args) {
        // Creating an object of Scanner class
        Scanner input = new Scanner(System.in);

        // Input rows and columns
        System.out.println("Enter number of rows");
        int rows = input.nextInt();
        System.out.println("Enter number of columns");
        int cols = input.nextInt();

        // Create and input the 2D array
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        // Create and copy elements into 1D array
        int[] singleArray = new int[rows * cols];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                singleArray[index++] = matrix[i][j];
            }
        }
        // Display the array
        System.out.print("1D Array ");
        for (int i = 0; i < singleArray.length; i++) {
            System.out.print(singleArray[i] + " ");
        }
        // Close Scanner
        input.close();
    }
}
