class GmailAccount {
	static String firstName;
	static String lastName;
	static String dateOfBirth;
	static String gender;
	static long phoneNumber;
	static String password;

	public static boolean registerGmail(String fname, String lname, String dob, String g, long phone, String pass){
		boolean isGmailRegistered = false;
		
		boolean isUserValidate = GmailAccountValidator.registerValidate(fname,lname,dob,g,phone,pass);
		
		if(isUserValidate == true)
			isGmailRegistered = true;
		else System.out.println("User is not validator and registered success");
		
		/*boolean fnameValid = false;
		boolean lnameValid = false;
		boolean dobValid = false;
		boolean genderValid = false;
		boolean phoneValid = false;
		boolean passwordValid = false;

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
		if(pass != null){
			password = pass;
			passwordValid = true;
		}

		if(fnameValid && lnameValid && dobValid && genderValid && phoneValid && passwordValid){
			isGmailRegistered = true;
		}*/
		return isGmailRegistered;
	}

	public static void getGmailAccountInfo(){
		firstName = GmailAccountValidator.firstName;
		lastName = GmailAccountValidator.lastName;
		dateOfBirth = GmailAccountValidator.dateOfBirth;
		gender = GmailAccountValidator.gender;
		phoneNumber = GmailAccountValidator.phoneNumber;
		password = GmailAccountValidator.password;
		
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Date of Birth: " + dateOfBirth);
		System.out.println("Gender: " + gender);
		System.out.println("Phone Number: " + phoneNumber);
		System.out.println("Password: " + password);
	}
}