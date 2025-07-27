class Festival {
	Festival(){
		System.out.println("The Festival cons is invoked");
	}
	Festival(int festivalId,String name,String country,String month,String type,String description){
		this.festivalId=festivalId;
		this.name=name;
		this.country=country;
		this.month=month;
		this.type=type;
		this.description=description;
	}
    int festivalId;
    String name;
    String country;
    String month;
    String type; 
    String description;
	
	public void fetFestivalInfo(){
	System.out.println("Festival ID: " +festivalId);
    System.out.println("Name: " + name);
    System.out.println("Country: " +country);
    System.out.println("Month: " + month);
    System.out.println("Type: " + type);
    System.out.println("Description: " + description);
}
}
