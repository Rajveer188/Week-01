import java.util.Scanner;
class SpringSeason {
	
	private static boolean checkSpring(int month, int day){
		boolean isSpring = (month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20);
		return isSpring;
	}
	
    public static void main(String[] args) {
		
		//input month and day from command line
		int month = Integer.parseInt(args[0]);
		int day = Integer.parseInt(args[1]);
       

        // Call method for cheking Spring Season
        boolean isSpring = checkSpring(month, day);
		
        System.out.println("Month " + month + ", Day " + day + ", Spring Season " + isSpring);

    }
}