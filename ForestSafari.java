class ForestSafari {
	ForestSafari(){
		System.out.println("The Forest safari is invoked");
	}
	public ForestSafari(int safariId, String location, String safariType, double durationInHours,int maxPeopleAllowed, double ticketPrice) {
        this.safariId = safariId;
        this.location = location;
        this.safariType = safariType;
        this.durationInHours = durationInHours;
        this.maxPeopleAllowed = maxPeopleAllowed;
        this.ticketPrice = ticketPrice;
    }
    
	int safariId;
    String location;
    String safariType;
    double durationInHours;
    int maxPeopleAllowed;
    double ticketPrice;
	
	public void getSafariInfo() {
	System.out.println("Safari ID: " + safariId);
	System.out.println("Location: " + location);
	System.out.println("Safari Type: " + safariType);
	System.out.println("Duration : " + durationInHours);
	System.out.println("Max People: " + maxPeopleAllowed);
	System.out.println("Ticket Price: " + ticketPrice);
}
}