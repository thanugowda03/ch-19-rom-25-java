class Politician {

 Politician() {
	System.out.println("Politician cons is invoked");
}
Politician(int politicianId,String name,String party,String constituency,String position,int yearsOfExperience){
	this.politicianId=politicianId;
	this.name=name;
	this.party=party;
	this.constituency=constituency;
	this.position=position;
	this.yearsOfExperience=yearsOfExperience;
}
   
    int politicianId;
    String name;
    String party;
    String constituency;
    String position;
    int yearsOfExperience;
	
	public void getPoliticianInfo() {
		System.out.println("Politician ID: " + politicianId);
        System.out.println("Name: " + name);
        System.out.println("Party: " + party);
        System.out.println("Constituency: " + constituency);
        System.out.println("Position: " + position);
        System.out.println("Years of Experience: " +yearsOfExperience);
	}
}
