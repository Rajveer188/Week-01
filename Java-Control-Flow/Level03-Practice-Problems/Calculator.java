import java.util.Scanner;

class Calculator {

    public static void main(String[] args) {
        
        //Create a scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Input for two numbers and operator
        System.out.println("Enter the first number:");
        double first = input.nextDouble();
        System.out.println("Enter the second number:");
        double second = input.nextDouble();
        System.out.println("Enter the operator (+, -, *, /):");
        String op = input.next();
        
        // Perform the operation
        double result;
        switch (op) {
            case "+":
                result = first + second;
                System.out.println("Result: " + result);
                break;
            case "-":
                result = first - second;
                System.out.println("Result: " + result);
                break;
            case "*":
                result = first * second;
                System.out.println("Result: " + result);
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero.");
                }
                break;
            default:
                System.out.println("Invalid Operator.");
        }
        
        input.close();
    }
}
