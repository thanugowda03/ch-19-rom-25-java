class Room{
String roomSize;
int roomNo;
String type;
boolean isBalconyAvailable;
String bedType;

Room(String roomSize,int roomNo,String type, boolean isBalconyAvailable,String bedType){
	this.roomSize=roomSize;
	this.roomNo=roomNo;
	this.type=type;
	this.isBalconyAvailable=isBalconyAvailable;
	this.bedType=bedType;
}

public void getRoomInfo(){
System.out.println("Room size "+roomSize);
System.out.println("Room no"+roomNo);
System.out.println("Room type"+type);
System.out.println("Is Balcony Available"+isBalconyAvailable);
System.out.println("Bed type"+bedType);
}
}