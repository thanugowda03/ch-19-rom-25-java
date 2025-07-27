class King {
	King() {
	System.out.println("King cons is invoked");
}
King(int kingId,String name,String dynasty,String region,int reignStartYear,int reignEndYear){
	this.kingId=kingId;
	this.name=name;
	this.dynasty=dynasty;
	this.region=region;
	this.reignStartYear=reignStartYear;
	this.reignEndYear=reignEndYear;
}
    int kingId;
    String name;
    String dynasty;
    String region;
    int reignStartYear;
    int reignEndYear;
	
	public void getKingInfo() {
	System.out.println("King ID: " + kingId);
    System.out.println("Name: " +name);
    System.out.println("Dynasty: " + dynasty);
    System.out.println("Region: " + region);
    System.out.println("Reign Start Year: " + reignStartYear);
    System.out.println("Reign End Year: " +reignEndYear);
	}
}
