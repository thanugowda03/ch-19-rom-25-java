class Planet{


String planetName;
int noOfMoons;
String massInKg;

Planet(String planetName,int noOfMoons,String massInKg){
this.planetName=planetName;
this.noOfMoons=noOfMoons;
this.massInKg=massInKg;

}

public void getPlanetInfo(){

System.out.println(" Plane name is "+planetName);
System.out.println("No of Monns "+noOfMoons);
System.out.println("Mass in Kg "+massInKg);

}
}