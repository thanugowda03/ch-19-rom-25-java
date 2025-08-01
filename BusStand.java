class BusStand {

String standId;
String name;
int noOfPlatforms;
Platform platform;

BusStand(String standId,String name,int noOfPlatforms,Platform platform){
this.standId=standId;
this.name=name;
this.noOfPlatforms=noOfPlatforms;
this.platform=platform;

}
public void getBusStandInfo(){
System.out.println("Stand Id "+standId);
System.out.println("BusStand Name "+name);
System.out.println("No of platforms "+noOfPlatforms);
System.out.println("Platform");
this.platform.getPlatformInfo();
}

}