class Squad{

	String squadName;
    int squadSize;
    String missionType;        
    boolean isEliteForce;
    String squadLeader;
	
	Squad(String squadName,int squadSize,String missionType,boolean isEliteForce,String squadLeader){
		 this.squadName = squadName;
		 this.squadSize = squadSize;
		 this.missionType = missionType;
		 this.isEliteForce = isEliteForce;
		 this.squadLeader = squadLeader;
	}
	
	public void getSquadInfo(){
	
		System.out.println("Squad name: "+squadName);
		System.out.println("Squad size: "+squadSize);
		System.out.println("Squad missionType: "+missionType);
		System.out.println("Squad isEliteForce: "+isEliteForce);
		System.out.println("Squad leader: "+squadLeader);
	}
}