//import random and scanner class
import java.util.Random;

class MatrixOperation{

    //method to create a random matrix
    public static int[][] generateRandomMatrix(int rows, int cols){

        //create object of random class
        Random rand = new Random();
        //2D array to store matrix
        int[][] matrix = new int[rows][cols];
        //generate matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10);
            }
        }
        //return generated matrix
        return matrix;
    }

    //method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2){
        //taking row and columb
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        
        //array to store result of addition
        int[][] result = new int[rows][cols];

        //perform addition operation
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        //return the result matrix
        return result;
    }

    //method to subtract two matrices
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2){
        //taking row and columb
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        //array to store result of subtraction
        int[][] result = new int[rows][cols];

        //perform subtraction operation
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        // return resultant matrix
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2){

        //variable to store row anc cols of two metrix
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        //check if multiplication possible
        if (cols1 != rows2) {
            System.out.println("Matrix multiplication is not possible. dimention is not same");
            return null;
        }

        //2D array to store result of multiplication
        int[][] result = new int[rows1][cols2];
        //perform multiplication 
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        //return result of multiplication
        return result;
    }

    // Method to find the transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix){
        //get rows and columb
        int rows = matrix.length;
        int cols = matrix[0].length;

        //2D array to store transpse matrix
        int[][] result = new int[cols][rows];

        //convert matrix into transpose matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        //return transpose matrix
        return result;
    }

    //method to find the determinant of a 2x2 matrix
    public static int determinant2x2(int[][] matrix){
        //find determinant
        int determinant = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];

        //return
        return determinant;
    }

    //method to find the determinant of a 3x3 matrix
    public static int determinant3x3(int[][] matrix) {
        //find determinant
        int determinant = matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
                - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);

        //return
        return determinant;
    }

    //method to find the inverse of a 2x2 matrix
    public static double[][] inverse2x2(int[][] matrix){
        //get determinat
        int determinant = determinant2x2(matrix);

        //array to store inverse
        double[][] inverse = new double[2][2];

        //find invers
        inverse[0][0] = matrix[1][1] / (double) determinant;
        inverse[0][1] = -matrix[0][1] / (double) determinant;
        inverse[1][0] = -matrix[1][0] / (double) determinant;
        inverse[1][1] = matrix[0][0] / (double) determinant;

        return inverse;
    }

    // Method to find the inverse of a 3x3 matrix
    public static double[][] inverse3x3(int[][] matrix){
        //get determinat
        int det = determinant3x3(matrix);
        
        //array to store adjoint
        double[][] adjoint = new double[3][3];

        //calculate adjoint of matrix
        adjoint[0][0] = matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1];
        adjoint[0][1] = -(matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]);
        adjoint[0][2] = matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0];

        adjoint[1][0] = -(matrix[0][1] * matrix[2][2] - matrix[0][2] * matrix[2][1]);
        adjoint[1][1] = matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0];
        adjoint[1][2] = -(matrix[0][0] * matrix[2][1] - matrix[0][1] * matrix[2][0]);

        adjoint[2][0] = matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1];
        adjoint[2][1] = -(matrix[0][0] * matrix[1][2] - matrix[0][2] * matrix[1][0]);
        adjoint[2][2] = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
 
        ////array to store inverse
        double[][] inverse = new double[3][3];

        //divide each element by the determinant to get the inverse
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inverse[i][j] = adjoint[i][j] / det;
            }
        }

        return inverse;
    }
    
    //method to display matrix
    public static void displayMatrix(int[][] matrix) {

        //Display matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    //main method
    public static void main(String[] args){

        //rows and cols
        int rows = 3;
        int cols = 3;

        int[][] matrix1 = generateRandomMatrix(rows, cols);
        int[][] matrix2 = generateRandomMatrix(rows, cols);

        System.out.println("Matrix 1-");
        displayMatrix(matrix1);

        System.out.println("Matrix 2-");
        displayMatrix(matrix2);

        System.out.println("Addition of Matrix 1 and Matrix 2-");
        int[][] additionResult = addMatrices(matrix1, matrix2);
        displayMatrix(additionResult);

        System.out.println("Subtraction of Matrix 1 and Matrix 2-");
        int[][] subtractionResult = subtractMatrices(matrix1, matrix2);
        displayMatrix(subtractionResult);

        System.out.println("Multiplication of Matrix 1 and Matrix 2-");
        int[][] multiplicationResult = multiplyMatrices(matrix1, matrix2);
        displayMatrix(multiplicationResult);

        System.out.println("Transpose of Matrix 1-");
        int[][] transposeResult1 = transposeMatrix(matrix1);
        displayMatrix(transposeResult1);

        System.out.println("Transpose of Matrix 2-");
        int[][] transposeResult2 = transposeMatrix(matrix2);
        displayMatrix(transposeResult2);

        System.out.println("Determinant of Matrix 1 - " + determinant3x3(matrix1));

        double[][] inverseMatrix1 = inverse3x3(matrix1);
        System.out.println("Inverse of Matrix 1 - ");
        if (inverseMatrix1 != null) {
            for (int i = 0; i < inverseMatrix1.length; i++) {
                for (int j = 0; j < inverseMatrix1[i].length; j++) {
                    System.out.print(inverseMatrix1[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
}
