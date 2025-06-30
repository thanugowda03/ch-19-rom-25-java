class Satellite {
    static String satelliteName;
    static String countryOfOrigin;
    static String agency;
    static String launchDate;
    static String orbitType;
    static String purpose;
    static String manufacturer;
    static String missionDurationYears;
    static String launchVehicle;
    static String frequencyBand;
    static String powerCapacity;
    static int transpondersCount;
    static String groundControlStation;
    static String weight;
    static String coverageArea;
    static String status;
    static String deorbitPlan;
    static int dataTransmissionRateMbps;
    static String stabilizationType;
	static String manufacturedBy;
  

 public static void main(String[] isro) {
    System.out.println("main started");
	
	System.out.println("Satellite Name: " + satelliteName);
    System.out.println("Country of Origin: " + countryOfOrigin);
    System.out.println("Agency: " + agency);
    System.out.println("Launch Date: " + launchDate);
    System.out.println("Orbit Type: " + orbitType);
    System.out.println("Purpose: " + purpose);
    System.out.println("Manufacturer: " + manufacturer);
    System.out.println("Mission Duration: " + missionDurationYears);
    System.out.println("Launch Vehicle: " + launchVehicle);
    System.out.println("Frequency Band: " + frequencyBand);
    System.out.println("Power Capacity (Watts): " + powerCapacity);
    System.out.println("Transponders Count: " + transpondersCount);
    System.out.println("Ground Control Station: " + groundControlStation);
    System.out.println("Weight (Kg): " + weight);
    System.out.println("Coverage Area: " + coverageArea);
    System.out.println("Status: " + status);
    System.out.println("Deorbit Plan: " + deorbitPlan);
    System.out.println("Data Transmission Rate: " + dataTransmissionRateMbps);
    System.out.println("Stabilization Type: " + stabilizationType);
    System.out.println("Manufactured by: " + manufacturedBy);	
	
	//re-Init	
    String satelliteName = "GSAT-30";
    String countryOfOrigin = "India";
    String agency = "ISRO";
    String launchDate = "January 17, 2020";
    String orbitType = "Geostationary";
    String purpose = "Communication";
    String manufacturer = "ISRO Satellite Centre";
    String missionDurationYears = "15";
    String launchVehicle = "Ariane 5";
    String frequencyBand = "Ku and C band";
    String powerCapacity = "5500 Watts";
    int transpondersCount = 48;
    String groundControlStation = "Bangalore";
    String weight = "3354kg";
    String coverageArea = "India, Asia Pacific";
    String status = "Operational";
    String deorbitPlan = "After mission completion";
    int dataTransmissionRateMbps = 120;
    String stabilizationType = "3-axis stabilized";
	String manufacturedBy = "ISRO Satellite Centre";

    System.out.println("Satellite Name: " + satelliteName);
    System.out.println("Country of Origin: " + countryOfOrigin);
    System.out.println("Agency: " + agency);
    System.out.println("Launch Date: " + launchDate);
    System.out.println("Orbit Type: " + orbitType);
    System.out.println("Purpose: " + purpose);
    System.out.println("Manufacturer: " + manufacturer);
    System.out.println("Mission Duration: " + missionDurationYears);
    System.out.println("Launch Vehicle: " + launchVehicle);
    System.out.println("Frequency Band: " + frequencyBand);
    System.out.println("Power Capacity (Watts): " + powerCapacity);
    System.out.println("Transponders Count: " + transpondersCount);
    System.out.println("Ground Control Station: " + groundControlStation);
    System.out.println("Weight (Kg): " + weight);
    System.out.println("Coverage Area: " + coverageArea);
    System.out.println("Status: " + status);
    System.out.println("Deorbit Plan: " + deorbitPlan);
    System.out.println("Data Transmission Rate: " + dataTransmissionRateMbps);
    System.out.println("Stabilization Type: " + stabilizationType);
	System.out.println("Manufacturer: " + manufacturedBy);
       

        System.out.println("main ended");
    }
}
