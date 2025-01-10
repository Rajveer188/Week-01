
import java.util.Scanner;

class HandshakeCalculator {

    public static void main(String[] args) {
        // Create a Scanner object 
        Scanner scanner = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Calculate the maximum number of handshakes
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // display the result
        System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is " + handshakes);

        scanner.close();
    }
}
