class Floor{

int floorNo;
Room room;

Floor(int floorNo,Room room){
	this.floorNo=floorNo;
	this.room = room;
	}
public void getFloorInfo(){
System.out.println("Floor number is"+floorNo);
System.out.println(" room are ");
 this.room.getRoomInfo();
}


}