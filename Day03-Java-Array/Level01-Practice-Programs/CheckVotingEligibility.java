//importing scanner class
import java.util.Scanner;

class CheckVotingEligibility{
	//main method 
	public static void main(String[] args){
		//Creating object of scanner class
		Scanner input = new Scanner(System.in);
		
		//creating array to store age of students
		int numberOfStudent = 10;
		int[] studentsAge = new int[numberOfStudent];
		
		//input students age using for loop
		System.out.println("Enter 10 students age");
		for(int i=0; i<numberOfStudent; i++){
			studentsAge[i] = input.nextInt();
		}
		//Checking if students eligible for voting or not
		for(int i=0; i<studentsAge.length; i++){
			if(studentsAge[i] < 0){
				System.out.println("invalid age");
			}else if(studentsAge[i] >= 18){
				System.out.println("The student with the age " + studentsAge[i] + " can vote.");
			}else{
				System.out.println("The student with the age " + studentsAge[i] + " cannot vote.");
			}
		}
		//Close scanner 
		input.close();
	}
}
