class Karate {
	Karate() {
	System.out.println("Karate cons is invoked");
}
	Karate(int karateId,String name,String rank,String style,String country,int yearsOfExperience) {
		this.karateId=karateId;
		this.name=name;
		this.rank=rank;
		this.style=style;
		this.country=country;
		this.yearsOfExperience=yearsOfExperience;
	}
    int karateId;
    String name;
    String rank;         
    String style;        
    String country;
    int yearsOfExperience;
	
	public void getKarateInfo() {
	 System.out.println("Karate ID: " +karateId);
     System.out.println("Name: " + name);
     System.out.println("Rank: " + rank);
     System.out.println("Style: " +style);
     System.out.println("Country: " +country);
     System.out.println("Years of Experience: " +yearsOfExperience);
}
}
