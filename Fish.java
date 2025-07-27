class Fish {
	Fish(){
	System.out.println("The Fish cons is invoked");
	}
	Fish(int fishId,String species,String habitat,double length,String color,String originCountry){
		this.fishId=fishId;
		this.species=species;
		this.habitat=habitat;
		this.length=length;
		this.color=color;
		this.originCountry=originCountry;
	}
    int fishId;
    String species;
    String habitat;
    double length; 
    String color;
    String originCountry;
	
public void getFishInfo() {
	System.out.println("Fish ID: " +fishId);
    System.out.println("Species: " + species);
    System.out.println("Habitat: " + habitat);
    System.out.println("Length: " + length);
    System.out.println("Color: " + color);
    System.out.println("Origin Country: " +originCountry);
}
}
