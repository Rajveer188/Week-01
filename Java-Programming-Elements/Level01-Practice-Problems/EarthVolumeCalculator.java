public class EarthVolumeCalculator {
    public static void main(String[] args) {
        //radius of the Earth in kilometers
        double radiusKm = 6378.0;

        //1 kilometer = 1.6 miles
        double kmToMilesFactor = 1.6;

        // Formula for the volume of a sphere: (4/3) * π * r^3
        double volumeKmCubed = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);

        // Convertin volume to cubic miles
        double volumeMilesCubed = volumeKmCubed / Math.pow(kmToMilesFactor, 3);

     
        System.out.printf("The volume of Earth in cubic kilometers is "+ volumeKmCubed + " and cubic miles is " + volumeMilesCubed);

    }
}
