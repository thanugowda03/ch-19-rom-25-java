class Court {
    static String courtName;
    static String location;
    static String courtType;
    static String address;
    static String contactNumber;
    static String email;
	static int numberOfJudges;
    static int numberOfCourtrooms;
    static int numberOfSupportStaff;
    static int numberOfPendingCases;
    static int numberOfDisposedCasesPerYear;
    static String chiefJudge;
    static String jurisdiction;
    static String website;
    static String workingHours;
    static int establishedYear;
    static String caseManagementSystem;
    static String languageOfProceedings;  
    static int numberOfParkingSpaces;
    static int floorsInBuilding;

 public static void main(String[] law) {
    System.out.println("main started");
	System.out.println("Court Name: " + courtName);
    System.out.println("Location: " + location);
    System.out.println("Court Type: " + courtType);
    System.out.println("Address: " + address);
    System.out.println("Contact Number: " + contactNumber);
    System.out.println("Email: " + email);
	System.out.println("Number of Judges: " + numberOfJudges);
    System.out.println("Number of Courtrooms: " + numberOfCourtrooms);
    System.out.println("Number of Support Staff: " + numberOfSupportStaff);
    System.out.println("Number of Pending Cases: " + numberOfPendingCases);
    System.out.println("Number of Disposed Cases Per Year: " + numberOfDisposedCasesPerYear);
    System.out.println("Chief Judge: " + chiefJudge);
    System.out.println("Jurisdiction: " + jurisdiction);
    System.out.println("Website: " + website);
    System.out.println("Working Hours: " + workingHours);
    System.out.println("Established Year: " + establishedYear);
    System.out.println("Case Management System: " + caseManagementSystem);
    System.out.println("Language of Proceedings: " + languageOfProceedings); 
    System.out.println("Number of Parking Spaces: " + numberOfParkingSpaces);
    System.out.println("Floors in Building: " + floorsInBuilding);
	

    //re-Init	
    String courtName = "Bangalore District Court";
    String location = "Bangalore, Karnataka";
    String courtType = "District Court";
    String address = "No. 1, Dr. Ambedkar Veedhi, Bangalore - 560001";
    String contactNumber = "080-2233-1234";
    String email = "info@bangalorecourt.gov.in";
	int numberOfJudges = 25;
    int numberOfCourtrooms = 15;
    int numberOfSupportStaff = 50;
    int numberOfPendingCases = 1200;
    int numberOfDisposedCasesPerYear = 4000;
    String chiefJudge = "Hon. Justice Anil Kumar";
    String jurisdiction = "Bangalore Urban District";
    String website = "www.karnatakajudiciary.kar.nic.in";
    String workingHours = "10:00 AM - 5:00 PM";
    int establishedYear = 1956;
    String caseManagementSystem = "e-Courts Portal";
    String languageOfProceedings = "Kannada, English";  
    int numberOfParkingSpaces = 100;
    int floorsInBuilding = 4;

        
        System.out.println("Court Name: " + courtName);
        System.out.println("Location: " + location);
        System.out.println("Court Type: " + courtType);
        System.out.println("Address: " + address);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Email: " + email);
		System.out.println("Number of Judges: " + numberOfJudges);
        System.out.println("Number of Courtrooms: " + numberOfCourtrooms);
        System.out.println("Number of Support Staff: " + numberOfSupportStaff);
        System.out.println("Number of Pending Cases: " + numberOfPendingCases);
        System.out.println("Number of Disposed Cases Per Year: " + numberOfDisposedCasesPerYear);
        System.out.println("Chief Judge: " + chiefJudge);
        System.out.println("Jurisdiction: " + jurisdiction);
        System.out.println("Website: " + website);
        System.out.println("Working Hours: " + workingHours);
        System.out.println("Established Year: " + establishedYear);
        System.out.println("Case Management System: " + caseManagementSystem);
        System.out.println("Language of Proceedings: " + languageOfProceedings); 
        System.out.println("Number of Parking Spaces: " + numberOfParkingSpaces);
        System.out.println("Floors in Building: " + floorsInBuilding);

        System.out.println("main ended");
    }
}
