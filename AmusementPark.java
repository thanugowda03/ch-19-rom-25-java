class AmusementPark {
	AmusementPark(){
		System.out.println("The Amusement Park is invoked");
	}
	AmusementPark(int parkId, String name, String location, String theme, int numberOfRides, int openingYear, double entryFee) {
        this.parkId = parkId;
        this.name = name;
        this.location = location;
        this.theme = theme;
        this.numberOfRides = numberOfRides;
        this.openingYear = openingYear;
        this.entryFee = entryFee;
    }
	int parkId;
	String name;
	String location;
	String theme;
	int numberOfRides;
	int openingYear;
	double entryFee;
	
	public void getParkInfo() {
	System.out.println("Park ID: " + parkId);
	System.out.println("Name: " + name);
	System.out.println("Location: " + location);
	System.out.println("Theme: " + theme);
	System.out.println("Number of Rides: " + numberOfRides);
	System.out.println("Opening Year: " + openingYear);
	System.out.println("Entry Fee: " +entryFee);
}
}