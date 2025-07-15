class BusBookingRunner{
	public static void main(String[] details){
	
	boolean isBooking = BusBooking.bookingRegister("Vikhyath","B G",26,"Male",9480102585l,"vikhyath12@gmail.com","kodagu","8:00 pm",350);
	System.out.println("Bus is booking "+isBooking);
	
	BusBooking.getUserInfo();
	}
}