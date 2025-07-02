class SolarSystem {
    static String systemName;    
    static String starName;                
    static int numberOfPlanets;
    static int numberOfDwarfPlanets;
    static int numberOfMoons;
    static String galaxy;
    static double ageInBillionsYears;
    static double distanceFromCenterOfGalaxy;
    static double diameterInMillionKm;  
    static String coldestPlanet;
    static String closestPlanetToSun;
    static String farthestPlanetFromSun;
    static double averageDistanceFromSunAU ; 
    static double speedOfSolarSystem;
	static String largestPlanet;
    static String hottestPlanet;
	static String smallestPlanet;
    static String earthPosition;
    static String nearestStarSystem;
	static int numberOfAsteroids;
	
	
  public static void main(String[] sun) {
    System.out.println("main started");
	System.out.println("System Name: " + systemName);
    System.out.println("Star Name: " + starName);
    System.out.println("Number of Planets: " + numberOfPlanets);
    System.out.println("Number of Dwarf Planets: " + numberOfDwarfPlanets);
    System.out.println("Number of Moons: " + numberOfMoons);
    System.out.println("Galaxy: " + galaxy);
    System.out.println("Age (in billions of years): " + ageInBillionsYears);
    System.out.println("Distance from Galaxy Center (light years): " + distanceFromCenterOfGalaxy);
    System.out.println("Diameter : " + diameterInMillionKm);
    System.out.println("Coldest planet: " + coldestPlanet);
    System.out.println("Closest Planet to Sun: " + closestPlanetToSun);
    System.out.println("Farthest Planet from Sun: " + farthestPlanetFromSun);
    System.out.println("Average Distance from Sun (AU): " + averageDistanceFromSunAU);
	System.out.println("Largest planet: " +largestPlanet );
    System.out.println("Hottest planet: " +hottestPlanet );
    System.out.println("smallest planet " +smallestPlanet );
    System.out.println("Earth position from the sun:"+earthPosition);
	System.out.println("The nearest Star System is:"+nearestStarSystem);
    System.out.println("No of Asteroids:"+numberOfAsteroids);
	
		   
	//re-Init	   
    String systemName = "Solar System";    
    String starName = "Sun";                
    int numberOfPlanets = 8;
    int numberOfDwarfPlanets = 5;
    int numberOfMoons = 214;
    String galaxy = "Milky Way";
    double ageInBillionsYears = 4.6;
    double distanceFromCenterOfGalaxy = 27000;
    double diameterInMillionKm = 287.46;  
    String coldestPlanet = "Neptune";
    String closestPlanetToSun = "Mercury";
    String farthestPlanetFromSun = "Neptune";
    double averageDistanceFromSunAU = 1.0; 
    double speedOfSolarSystem = 828000;
	String largestPlanet = "Jupiter";
    String hottestPlanet = "Venus";
	String smallestPlanet = "Mercury";
    String earthPosition = "3rd planet from the sun";
	String nearestStarSystem = "Alpha Centauri";
    int numberOfAsteroids = 1000000;
	
    System.out.println("System Name: " + systemName);
    System.out.println("Star Name: " + starName);
    System.out.println("Number of Planets: " + numberOfPlanets);
    System.out.println("Number of Dwarf Planets: " + numberOfDwarfPlanets);
    System.out.println("Number of Moons: " + numberOfMoons);
    System.out.println("Galaxy: " + galaxy);
    System.out.println("Age (in billions of years): " + ageInBillionsYears);
    System.out.println("Distance from Galaxy Center (light years): " + distanceFromCenterOfGalaxy);
    System.out.println("Diameter : " + diameterInMillionKm);
    System.out.println("Coldest planet: " + coldestPlanet);
    System.out.println("Closest Planet to Sun: " + closestPlanetToSun);
    System.out.println("Farthest Planet from Sun: " + farthestPlanetFromSun);
    System.out.println("Average Distance from Sun (AU): " + averageDistanceFromSunAU);
	System.out.println("Largest planet: " +largestPlanet );
    System.out.println("Hottest planet: " +hottestPlanet );
    System.out.println("smallest planet " +smallestPlanet );
    System.out.println("Earth position from the sun:"+earthPosition);
    System.out.println("The nearest Star System is:"+nearestStarSystem);
    System.out.println("No of Asteroids:"+numberOfAsteroids);

        System.out.println("main ended");
    }
}

