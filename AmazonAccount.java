class AmazonAccount {

    static String fullName;
    static String email;
    static String dateOfBirth;
    static String gender;
    static long phoneNumber;
    static String password;

    public static boolean registerAmazon(String name, String mail, String dob, String g, long phone, String pass) {
        
		boolean isRegistered = false;
		boolean nameValid = false;
        boolean emailValid = false;
        boolean dobValid = false;
        boolean genderValid = false;
        boolean phoneValid = false;
        boolean passwordValid = false;

        if (name != null) {
            fullName = name;
            nameValid = true;
        }

        if (mail != null) {
            email = mail;
            emailValid = true;
        }

        if (dob != null) {
            dateOfBirth = dob;
            dobValid = true;
        }

        if (g != null) {
            gender = g;
            genderValid = true;
        }

        if (phone != 0) {
            phoneNumber = phone;
            phoneValid = true;
        }

        if (pass != null) {
            password = pass;
            passwordValid = true;
        }
		

        if (nameValid && emailValid && dobValid && genderValid && phoneValid && passwordValid) {
            isRegistered = true;
        }

        return isRegistered;
    }
	
	public static boolean validateUser() {
		boolean isUserValidate = false;
		
		if(isUserValidate == true)
		System.out.println("User validator and registered success");
		
		return isUserValidate;
	}	

   
    public static void getAmazonAccountInfo() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Email: " + email);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Gender:" + gender);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Password: " + password);
    }
}