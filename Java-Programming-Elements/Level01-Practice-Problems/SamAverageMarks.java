class SamAverageMarks{
	public static void main(String[] args){
		
		String name = "Sam";
		int marksInMath = 94;
		int marksInPhysics = 95;
		int marksInChemistry = 96;
		int numberOfSubject = 3;
		
		int totalMarksInPCM = marksInMath + marksInPhysics + marksInChemistry;
		float averageMarksInPCM = totalMarksInPCM / numberOfSubject;
		
		System.out.println(name + "'s average mark in PCM is " + averageMarksInPCM);
	}
}
		
		
		