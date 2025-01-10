import java.util.Scanner;

class CountDownWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input variable declaration
        System.out.print("Enter countdown start: ");
        int counter = input.nextInt();

        // Countdown loop
        while (counter > 0) {
            System.out.println(counter);
            counter--;
        }
        System.out.println("Liftoff!");

        input.close();
    }
}
