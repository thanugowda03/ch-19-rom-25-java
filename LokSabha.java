class LokSabha{
	
	int sessionNummber;
	String speakerName;
	int totalSeats;
	String rulingParty;
	Seat seat;
	
	LokSabha(int sessionNummber,String speakerName,int totalSeats,String rulingParty,Seat seat){
		this.sessionNummber = sessionNummber;
		this.speakerName = speakerName;
		this.totalSeats = totalSeats;
		this.rulingParty = rulingParty;
		this.seat = seat;
	}
	
	public void getLokSabhaInfo(){
	
		System.out.println("LokSabha sessionNummber: "+sessionNummber);
		System.out.println("LokSabha speakerName: "+speakerName);
		System.out.println("LokSabha totalSeats: "+totalSeats);
		System.out.println("LokSabha rulingParty: "+rulingParty);
		System.out.println("Seat information: ");
		this.seat.getSeatInfo();
	}

}