class Mejestic {

String location;
int noOfBusStands;
int noOfPlatform;
BusStand busstand;


Mejestic(String location,int noOfBusStands,int noOfPlatform,BusStand busstand) {

this.location=location;
this.noOfBusStands=noOfBusStands;
this.noOfPlatform=noOfPlatform;
this.busstand=busstand;
}
public void getMejesticInfo(){
System.out.println("Mejestic location "+location);
System.out.println("No of bustands "+noOfBusStands);
System.out.println("No Of platform "+noOfPlatform);
System.out.println("Bus stand");

this.busstand.getBusStandInfo();
}
}