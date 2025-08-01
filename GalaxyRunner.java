class GalaxyRunner {
	
public static void main(String []sun){

Planet planet=new Planet("Earth",1,"5.972*10^24 Kg");
SolarSystem solarsystem= new SolarSystem("Solar System",8,"Sun",planet);
Galaxy galaxy=new Galaxy("Milky Way","Barred Spiral Galaxy",180,solarsystem);

galaxy.getGalaxyInfo();

}
}