class Invitation {
	Invitation() {
		System.out.println("The Invitation Cons is invoked");
	}
	Invitation(int invitationId,String eventType,String hostName,String location,String date,String time,String dressCode) {
		this.invitationId=invitationId;
		this.eventType=eventType;
		this.hostName=hostName;
		this.location=location;
		this.date=date;
		this.time=time;
		this.dressCode=dressCode;
	}
	
    int invitationId;
    String eventType;
    String hostName;
    String location;
    String date;
    String time;
    String dressCode;
	
	public void getInvitationInfo() {
	System.out.println("Invitation ID: " + invitationId);
    System.out.println("Event Type: " + eventType);
    System.out.println("Host Name: " + hostName);
    System.out.println("Location: " + location);
    System.out.println("Date: " + date);
    System.out.println("Time: " + time);
    System.out.println("Dress Code: " +dressCode);
}
}
