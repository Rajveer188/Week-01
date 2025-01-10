class PenDistribution{
	public static void main(String[] args){
		
		int totalNumberOfPens = 13, totalNumberOfStudents = 3;
		
		int penPerStudent = totalNumberOfPens / totalNumberOfStudents;
		int remainingPens = totalNumberOfPens % totalNumberOfStudents;
		
		System.out.println("The Pen Per Student is " + penPerStudent + " and the remaining pen not distributed is " + remainingPens);
		
	}
}
