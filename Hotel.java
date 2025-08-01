class Hotel {


String hotelName;
String ownerName;
int noOfWorkers;
Floor floor;

Hotel(String hotelName,String ownerName,int noOfWorkers,Floor floor){
	this.hotelName=hotelName;
	this.ownerName=ownerName;
	this.noOfWorkers=noOfWorkers;
	this.floor = floor;
}	
public void getHotelInfo(){
System.out.println("Hotel name is"+hotelName);
System.out.println("Hotel owner Nameis "+ownerName);
System.out.println("No of workers in hotel "+noOfWorkers);
System.out.println(" floor are: ");
this.floor.getFloorInfo();
}

}