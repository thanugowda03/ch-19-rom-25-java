class Platform {

String platformId;
String platformType;
String platformLength;

Platform(String platformId,String platformType,String platformLength){
this.platformId=platformId;
this.platformType=platformType;
this.platformLength=platformLength;

}
public void getPlatformInfo(){
System.out.println("Platform Id "+platformId);
System.out.println("Platform Type is "+platformType);
System.out.println("Platform Lenths in meter "+platformLength);
}
}