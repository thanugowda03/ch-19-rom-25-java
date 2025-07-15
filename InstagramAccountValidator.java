class InstagramAccountValidator{
	static String userName;
    static String fullName;
    static String dateOfBirth;
    static String gender;
    static long phoneNumber;
    static String password;

	
    public static boolean validateInstagram(String uname, String fname, String dob, String g, long phone, String pass){
	boolean isUserValidate = false;
	boolean unameValid = false;
        boolean fnameValid = false;
        boolean dobValid = false;
        boolean genderValid = false;
        boolean phoneValid = false;
        boolean passwordValid = false;
		
		if(uname != null ){
            userName = uname;                
            unameValid = true;
        }else System.out.println("userName is not valid");

        if(fname != null ){
            fullName = fname;
            fnameValid = true;
        }else System.out.println("fullName is not valid");

        if(dob != null){
            dateOfBirth = dob;
            dobValid = true;
        }else System.out.println("dateOfBirth is not valid");

        if(g != null){
            gender = g;
            genderValid = true;
        }else System.out.println("gender is not valid");

        if(phone != 0){
            phoneNumber = phone;
            phoneValid = true;
        }else System.out.println("phone number is not valid");

        if(pass != null){
            password = pass;
            passwordValid = true;
        }else System.out.println("password is not valid");

        if(unameValid && fnameValid && dobValid && genderValid && phoneValid && passwordValid){
            isUserValidate = true;
        }
		return isUserValidate;
	}
	
	}