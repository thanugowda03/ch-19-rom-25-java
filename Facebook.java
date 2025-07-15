class Facebook{
	static String firstName;
	static String surName;
	static String dateOfbirth;
	static String gender;
	static long mobileNumber;
	static String email;
	static String password;
	
	public static boolean registerUser(String fName,String sName,String dob,String g, long mobileNum,String mail,String pword){
	boolean isUserRegistered = false;
	boolean firstNameValid = false;
	boolean surNameValid = false;
	boolean dateOfbirthValid = false;
	boolean genderValid = false;
	boolean mobileNumberValid = false;
	boolean emailValid = false;
	boolean passwordValid = false;
		if(fName != null){
			firstName = fName;
			firstNameValid = true;
		}
		if(sName != null){
			surName = sName;
			surNameValid = true;
		}
		if(dob != null){
			dateOfbirth = dob;
			dateOfbirthValid = true;
		}
		if(g != null){
			gender = g;
			genderValid = true;
		}
		if(mobileNum != 0){
			mobileNumber = mobileNum;
			mobileNumberValid = true;
		}
		if(mail != null){
			email = mail;
			emailValid = true;
		}
		if(pword != null){
			password = pword;
			passwordValid = true;
		}
		if(firstNameValid &&  surNameValid && dateOfbirthValid && genderValid && mobileNumberValid && emailValid &&  passwordValid){
			isUserRegistered = true;
		}
		
		return isUserRegistered;
	}
	public static void getUserInfo(){
		System.out.println("The first Name is: "+firstName);
		System.out.println("The sur name is: "+surName);
		System.out.println("The date Of birth: " +dateOfbirth);
		System.out.println("The gender: "+ gender);
		System.out.println("The mobileNumber is: "+ mobileNumber);
		System.out.println("The email is: "+email);
		System.out.println("The password is: "+ password);
	}
}