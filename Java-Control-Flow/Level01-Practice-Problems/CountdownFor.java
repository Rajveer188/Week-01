import java.util.Scanner;

class CountdownFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input variable declaration
        System.out.print("Enter countdown start: ");
        int counter = input.nextInt();

        // Countdown loop
        for (int i = counter; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("Liftoff!");

        input.close();
    }
}