class PoliceStation {
    static String stationName;
    static String city;
    static String state;
    static String area;
	static int numberOfOfficers;
    static int numberOfConstables;
    static int numberOfVehicles;
    static int numberOfCasesSolved;
    static String email;
    static String stationInCharge;
    static String establishedYear;
    static String address;
    static String stationType;
    static int numberOfPendingCases;
    static int numberOfCCTVInstalled;
    static int numberOfCells;
    static int numberOfFloors;
	static String workingHours;
	static int numberOfPatrolVehicles;
	static int numberOfWomenOfficers;

 public static void main(String[] police) {
    System.out.println("main started");

    System.out.println("Station Name: " + stationName);
    System.out.println("City: " + city);
    System.out.println("State: " + state);
    System.out.println("Area: " + area);	
	System.out.println("Number of Officers: " + numberOfOfficers);
    System.out.println("Number of Constables: " + numberOfConstables);
    System.out.println("Number of Vehicles: " + numberOfVehicles);
    System.out.println("Number of Cases Solved: " + numberOfCasesSolved);
    System.out.println("Email: " + email);
    System.out.println("Station In-Charge: " + stationInCharge);
    System.out.println("Established Year: " + establishedYear);
    System.out.println("Address: " + address);
    System.out.println("Station Type: " + stationType);
    System.out.println("Number of Pending Cases: " + numberOfPendingCases);
    System.out.println("Number of CCTV Installed: " + numberOfCCTVInstalled);
    System.out.println("Number of Cells: " + numberOfCells);
    System.out.println("Station Building Floors: " + numberOfFloors);
	System.out.println("Working hours " + workingHours);
	System.out.println("Number of Patrol Vehicles: " + numberOfPatrolVehicles);
	System.out.println("Number of Women Offices: " + numberOfWomenOfficers);
		
    //re-Init 
	String stationName = "Jayanagar Police Station";
    String city = "Bangalore";
    String state = "Karnataka";
    String area = "Jayanagar 4th Block";
	int numberOfOfficers = 35;
    int numberOfConstables = 60;
    int numberOfVehicles = 12;
    int numberOfCasesSolved = 1850;
    String email = "jayanagar.ps@ksp.gov.in";
    String stationInCharge = "Inspector Ramesh Gowda";
    String establishedYear = "1982";
    String address = "4th Block, Jayanagar, Bangalore - 560041";
    String stationType = "Urban";
    int numberOfPendingCases = 120;
    int numberOfCCTVInstalled = 48;
    int numberOfCells = 4;
    int numberOfFloors = 3;
	String workingHours = "24/7";
	int numberOfPatrolVehicles = 2;
	int numberOfWomenOfficers = 15;

        System.out.println("Station Name: " + stationName);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Area: " + area);	
		System.out.println("Number of Officers: " + numberOfOfficers);
        System.out.println("Number of Constables: " + numberOfConstables);
        System.out.println("Number of Vehicles: " + numberOfVehicles);
        System.out.println("Number of Cases Solved: " + numberOfCasesSolved);
        System.out.println("Email: " + email);
        System.out.println("Station In-Charge: " + stationInCharge);
        System.out.println("Established Year: " + establishedYear);
        System.out.println("Address: " + address);
        System.out.println("Station Type: " + stationType);
        System.out.println("Number of Pending Cases: " + numberOfPendingCases);
        System.out.println("Number of CCTV Installed: " + numberOfCCTVInstalled);
        System.out.println("Number of Cells: " + numberOfCells);
        System.out.println("Station Building Floors: " + numberOfFloors);
		System.out.println("Working hours " + workingHours);
	    System.out.println("Number of Patrol Vehicles: " + numberOfPatrolVehicles);
	    System.out.println("Number of Women Offices: " + numberOfWomenOfficers);

        System.out.println("main ended");
    }
}
