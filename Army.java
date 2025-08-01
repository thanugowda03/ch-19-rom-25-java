class Army{
	
	String armyName;          
    int soldiersCount;
    String commandingOfficer;
    String baseLocation;
	Squad squad;
	
	Army(String armyName,int soldiersCount,String commandingOfficer,String baseLocation,Squad squad){
		this.armyName = armyName;
		this.soldiersCount =soldiersCount;
		this.commandingOfficer = commandingOfficer;
		this.baseLocation = baseLocation;
		this.squad = squad;
	}
	
	public void getArmyInfo(){
		
		System.out.println("Army name: "+armyName);
		System.out.println("Army soldiersCount: "+soldiersCount);
		System.out.println("Army commandingOfficer: "+commandingOfficer);
		System.out.println("Army baseLocation: "+baseLocation);
		System.out.println("Squad information: ");
		this.squad.getSquadInfo();
	}
	
}