class SBIBankAccount {
	static String accountHolderName;
	static String accountHolderSurname;
	static String accountHolderNameFatherName;
	static String dateOfBirth;
	static String gender;
	static long phoneNumber;
	static String email;
	static String permanetAddress;

	public static boolean registerAccount(String name, String surname,String fatherName ,String dob, String g, long phone, String mail, String pAddress){
		boolean isAccountRegistered = false;
		boolean nameValid = false;
		boolean surnameValid = false;
		boolean fatherNameValid = false;
		boolean dobValid = false;
		boolean genderValid = false;
		boolean phoneValid = false;
		boolean emailValid = false;
		boolean pAddressValid = false;

		if(name != null){
			accountHolderName = name;
			nameValid = true;
		}
		if(surname != null){
			accountHolderSurname = surname;
			surnameValid = true;
		}
		if(fatherName != null){
			accountHolderNameFatherName = fatherName;
			fatherNameValid = true;
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
		if(pAddress != null){
			permanetAddress = pAddress;
			pAddressValid = true;
		}

		if(nameValid && surnameValid && fatherNameValid && dobValid && genderValid && phoneValid && emailValid && pAddressValid){
			isAccountRegistered = true;
		}
		return isAccountRegistered;
	}
	public static boolean registerValidate(){
		
		boolean isUserValidate = false;
		
		if(isUserValidate == true)
			System.out.println("User validator and registered success");
		else System.out.println("User not validator and registered success");
		
		return isUserValidate;
	}

	public static void getAccountDetails(){
		System.out.println("Account holder name: " + accountHolderName);
		System.out.println("Surname: " + accountHolderSurname);
		System.out.println("Account holder father name: "+accountHolderNameFatherName);
		System.out.println("Date of Birth: " + dateOfBirth);
		System.out.println("Gender: " + gender);
		System.out.println("Phone Number: " + phoneNumber);
		System.out.println("Email: " + email);
		System.out.println("Permanet address: " + permanetAddress);
	}
}