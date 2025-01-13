//import scanner class
import java.util.Scanner;

class Quadratic {

    //method to find the roots
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            return new double[]{};
        }
    }
    
	//main method 
    public static void main(String[] args){
		//create scanner object
        Scanner scanner = new Scanner(System.in);

        // Input a, b, c
        System.out.print("Enter a ");
        double a = scanner.nextDouble();
        System.out.print("Enter b ");
        double b = scanner.nextDouble();
        System.out.print("Enter c ");
        double c = scanner.nextDouble();

        //find roots
        double[] roots = findRoots(a, b, c);

        // Display roots
        if (roots.length == 2) {
            System.out.printf("Roots of the equation are: %.2f and %.2f%n", roots[0], roots[1]);
        } else if (roots.length == 1) {
            System.out.printf("Root of the equation is: %.2f%n", roots[0]);
        } else {
            System.out.println("No real roots exist for the equation.");
        }

        scanner.close();
    }
}
