class KiloMeterToMiles{
	public static void main(String[] args){
		float distanceInKilometer = 10.8f;
		float kmToMilesFactor = 1.6f;
		
		float distanceInMiles = distanceInKilometer * kmToMilesFactor;
		
		System.out.println("The distance " + distanceInKilometer + " km in miles is " + distanceInMiles);
		
	}
}
