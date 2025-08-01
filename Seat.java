class Seat{

	int seatNumber;
	String constituency;
	String state;
	boolean isReserved;
	String partyWon;
	Politicians politicians;
	
	Seat(int seatNumber,String constituency,String state,boolean isReserved,String partyWon,Politicians politicians){
		this.seatNumber = seatNumber;
		this.constituency = constituency;
		this.state = state;
		this.isReserved = isReserved;
		this.partyWon = partyWon;
		this.politicians = politicians;
	}
	
	public void getSeatInfo(){
	
		System.out.println("Seat number: "+seatNumber);
		System.out.println("Seat constituency: "+constituency);
		System.out.println("Seat state: "+state);
		System.out.println("Seat isReserved: "+isReserved);
		System.out.println("Seat partyWon: "+partyWon);
		System.out.println("Politicians information: ");
		this.politicians.getPoliticiansInfo();
	}
}