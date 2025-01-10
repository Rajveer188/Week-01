import java.util.Scanner;

class VotingEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input variable declaration
        System.out.print("Enter age: ");
        int age = input.nextInt();

        // Check voting eligibility
        System.out.println("Age: " + age + ", Can vote: " + (age >= 18));
        input.close();
    }
}
