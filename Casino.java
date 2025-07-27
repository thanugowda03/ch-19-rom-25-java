class Casino {
	Casino(){
		System.out.println("The Casino cons is invoked");
	}
	Casino(int casinoId,String name,String location,int numberOfGames,String owner,double entryFee){
	this.casinoId=casinoId;
    this.name=name;
    this.location=location;
    this.numberOfGames=numberOfGames;
    this.owner=owner;
    this.entryFee=entryFee;	
	}
    int casinoId;
    String name;
    String location;
    int numberOfGames;
    String owner;
    double entryFee;
	
	public void getCasinoInfo() {
	System.out.println("The casino id is " + casinoId);
    System.out.println("The casino name is " + name);
    System.out.println("The casino location is " + location);
    System.out.println("The number of games in the casino is " + numberOfGames);
    System.out.println("The casino owner is " + owner);
    System.out.println("The casino entry fee is " + entryFee);
	}
}
