class BusBooking{
	static String passengerFirstName;
	static String passengerLastName;
	static int age;
	static String gender;
	static long phoneNumber;
	static String email;
	static String travalingAddress;
	static String busTime ;
	static int tikectAmount;
	
	public static boolean bookingRegister(String pfName,String plName, int age, String g,long phNum, String mail, String tAddress,String bTime,int tAmount){
	
	boolean isBooking = false;
	boolean passengerFirstNameValid = false;
	boolean passengerLastNameValid = false;
	boolean ageValid = false;
	boolean genderValid = false;
	boolean phoneNumberValid = false;
	boolean emailValid = false;
	boolean travalingAddressValid = false;
	boolean busTimeValid = false;
	boolean tikectAmountValid = false;
	
		if(pfName != null){
			passengerFirstName = pfName;
			passengerFirstNameValid = true;
		}
		if(plName != null){
			passengerLastName = plName;
			passengerLastNameValid = true;
		}
		if(age != 0){
			ageValid = true;
		}
		if(g != null){
			gender = g;
			genderValid = true;
		}
		if(phNum != 0){
			phoneNumber = phNum;
			phoneNumberValid = true;
		}
		if(mail != null){
			email = mail;
			emailValid = true;
		}
		if(tAddress != null){
			travalingAddress = tAddress;
			tikectAmountValid = true;
		}
		if(bTime != null){
			busTime = bTime;
			busTimeValid = true;
		}
		if(tAmount != 0){
			tikectAmount = tAmount;
			tikectAmountValid = true;
		}
		if(passengerFirstNameValid && passengerLastNameValid && ageValid && genderValid && phoneNumberValid && emailValid && tikectAmountValid && busTimeValid && tikectAmountValid){
			isBooking = true;
		}
		return isBooking;
	}
	public static boolean registerValidate(){
		boolean isUserValidate = false;
		
		if(isUserValidate == true){
			System.out.println("User register and validate success");
		}else System.out.println("User not register and validate success");
		
		return isUserValidate;
	}
	
	
		public static void getUserInfo(){
			System.out.println("The passenger First Name is : "+ passengerFirstName);
			System.out.println("The passenger last Name is: "+ passengerLastName);
			System.out.println("The passenger age is: "+age);
			System.out.println("The passenger gender is: "+gender);
			System.out.println("The passenger phoneNumber is: "+phoneNumber);
			System.out.println("The passenger email is: "+ email);
			System.out.println("The passenger travaling Address is: "+travalingAddress);
			System.out.println("The bus time in stand: "+busTime);
			System.out.println("The tikect Amount is: "+tikectAmount);
			
	}
}