class Pvr {

String pvrName;
String pvrLocation;
double rating;
int totalScreen;
Screen screen;

Pvr(String pvrName,String pvrLocation,double rating,int totalScreen,Screen screen) {
this.pvrName=pvrName;
this.pvrLocation=pvrLocation;
this.rating=rating;
this.totalScreen=totalScreen;
this.screen=screen;
}


public void getPvrInfo() {

System.out.println("Pvr Name is "+pvrName);
System.out.println("Pvr Location is "+pvrLocation);
System.out.println("Pvr rating is "+rating);
System.out.println("Total screens "+screen);
System.out.println("Screen is");
this.screen.getScreenInfo();
}


}