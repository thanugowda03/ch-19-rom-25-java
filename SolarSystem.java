class SolarSystem {

String name;
int noOfPlanet;
String starName;
Planet planet;

SolarSystem(String name,int noOfPlanet,String starName,Planet planet){
this.name=name;
this.noOfPlanet=noOfPlanet;
this.starName=starName;
this.planet=planet;

}
public void getSolarSystemInfo() {
System.out.println("Name of the solar system "+name);
System.out.println("No of planets "+noOfPlanet);
System.out.println("Star Name "+starName);
this.planet.getPlanetInfo();
}

}