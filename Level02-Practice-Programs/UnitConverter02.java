class UnitConverter02{

    // Length conversions
    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double convertInchesToCentimeters(double inches) {
        return inches * 2.54;
    }

  
    public static void main(String[] args) {
        System.out.println("10 yards = " + convertYardsToFeet(10) + " feet");
		System.out.println("10 feet = " + convertFeetToYards(10) + " yard");
		System.out.println("100 meters = " + convertMetersToInches(100) + " inches");
        System.out.println("100 inches = " + convertInchesToMeters(100) + " meters");
        System.out.println("100 inches = " + convertInchesToCentimeters(100) + " inches");
    }
}
