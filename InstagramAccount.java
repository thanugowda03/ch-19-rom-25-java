class InstagramAccount {
    
    static String userName;
    static String fullName;
    static String dateOfBirth;
    static String gender;
    static long phoneNumber;
    static String password;

    public static boolean registerInstagram(String uname, String fname, String dob, String g, long phone, String pass){
        boolean isRegistered = false;
		
		boolean isUserValidate = InstagramAccountValidator.validateInstagram(uname,fname,dob,g,phone,pass);
		
		if(isUserValidate == true){
			isRegistered = true;
		}else System.out.println("User is not validator and registered success");
		

       /* boolean unameValid = false;
        boolean fnameValid = false;
        boolean dobValid = false;
        boolean genderValid = false;
        boolean phoneValid = false;
        boolean passwordValid = false;

        if(uname != null ){
            userName = uname;                
            unameValid = true;
        }

        if(fname != null ){
            fullName = fname;
            fnameValid = true;
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

        if(unameValid && fnameValid && dobValid && genderValid && phoneValid && passwordValid){
            isRegistered = true;
        }*/

        return isRegistered;
    }

    public static void getInstagramAccountInfo(){
		
		userName = InstagramAccountValidator.userName;
		fullName = InstagramAccountValidator.fullName;
		dateOfBirth = InstagramAccountValidator.dateOfBirth;
		gender = InstagramAccountValidator.gender;
		phoneNumber = InstagramAccountValidator.phoneNumber;
		password = InstagramAccountValidator.password;
		
        System.out.println("User Name: " + userName);
        System.out.println("Full Name: " + fullName);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Gender: " + gender);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Password: " + password);
    }
}