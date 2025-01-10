import java.util.Scanner;

public class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input for the number of chocolates and children
        System.out.println("Enter the number of chocolates: ");
        int numberOfChocolates = input.nextInt();
        System.out.println("Enter the number of children: ");
        int numberOfChildren = input.nextInt();

        // Calculate chocolates per child and remaining chocolates
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        // Output the result
        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + 
                           " and the number of remaining chocolates are " + remainingChocolates + ".");
    }
}
