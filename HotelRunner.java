class HotelRunner{

public static void main(String args[]) {

Room room=new Room("20*30sqft",10,"Bed Room",true,"Single");
Floor floor=new Floor(15,room);
Hotel hotel=new Hotel("Sannidhi","Thanushree",67,floor);
//has-A-Relationship

/*hotel.hotelName=hotelName;
hotel.ownerName=ownerName;
hotel.noOfWorkers=noOfWorkers;*/





hotel.getHotelInfo();

}


}