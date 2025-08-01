class Galaxy{

String galaxyName;
String galaxyType;
int noOfSolarSystem;
SolarSystem solarsystem;

Galaxy(String galaxyName,String galaxyType,int noOfSolarSystem,SolarSystem solarsystem){
this.galaxyName=galaxyName;
this.galaxyType=galaxyType;
this.noOfSolarSystem=noOfSolarSystem;
this.solarsystem=solarsystem;
}

public void getGalaxyInfo(){
System.out.println("Galaxy name is "+galaxyName);
System.out.println("Galaxy Type is "+galaxyType);
System.out.println("No of solar system is "+noOfSolarSystem);
System.out.println("Solar System");
this.solarsystem.getSolarSystemInfo();
}

}