class YouTubeAccount {
	static String firstName;
	static String lastName;
	static String dateOfBirth;
	static String gender;
	static long phoneNumber;
	static String email;
	static String channelName;

	public static boolean registerAccount(String fname, String lname, String dob, String g, long phone, String mail, String cname){
		boolean isAccountCreated = false;
		boolean fnameValid = false;
		boolean lnameValid = false;
		boolean dobValid = false;
		boolean genderValid = false;
		boolean phoneValid = false;
		boolean emailValid = false;
		boolean channelNameValid = false;

		if(fname != null){
			firstName = fname;
			fnameValid = true;
		}
		if(lname != null){
			lastName = lname;
			lnameValid = true;
		}
		if(dob != null){
			dateOfBirth = dob;
			dobValid = true;
		}
		if(g != null){
			gender = g;
			genderValid = true;
		}
		if(phone != 0){
			phoneNumber = phone;
			phoneValid = true;
		}
		if(mail != null){
			email = mail;
			emailValid = true;
		}
		if(cname != null){
			channelName = cname;
			channelNameValid = true;
		}

		if(fnameValid && lnameValid && dobValid && genderValid && phoneValid && emailValid && channelNameValid){
			isAccountCreated = true;
		}
		return isAccountCreated;
	}
	public static boolean registerValidate(){
		boolean isUserValidate = false;
		
		if(isUserValidate == true){
			System.out.println("User register and validate success");
		}else System.out.println("User not register and validate success");
		
		return isUserValidate;
	}

	public static void getChannelDetails(){
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Date of Birth: " + dateOfBirth);
		System.out.println("Gender: " + gender);
		System.out.println("Phone Number: " + phoneNumber);
		System.out.println("Email: " + email);
		System.out.println("Channel Name: " + channelName);
	}
}