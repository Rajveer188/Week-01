// Importing Scanner class
import java.util.Scanner;

class YoungestAndTallest {
    // Main method
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // create arry to store age and height
        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Input age and height from user
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age of and height of " + names[i]);
            ages[i] = input.nextInt();
            heights[i] = input.nextDouble();
        }

        //Finding youngest and tallest
        int youngestIndex = 0;
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        System.out.println("Youngest Friend " + names[youngestIndex]);
        System.out.println("Tallest Friend " + names[tallestIndex]);

        // Close Scanner
        input.close();
    }
}
