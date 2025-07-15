class GmailAccountValidator {
	static String firstName;
	static String lastName;
	static String dateOfBirth;
	static String gender;
	static long phoneNumber;
	static String password;

	public static boolean registerValidate(String fname, String lname, String dob, String g, long phone, String pass){
	
	boolean isUserValidate = false;
	boolean fnameValid = false;
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
			isUserValidate = true;
		}
	return isUserValidate;
	}
	}