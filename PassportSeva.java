class PassportSeva{
	static String passportOffice;
	static String givenName;
	static String surName;
	static String dateOfbrith;
	static String email;
	static String loginId;
	static String passWord;
	static String confirmPassword;
	static String hintQuestion;
	static String hintAnswer;
	static String enterChractersDisplayed;
	
	public static boolean registerUser(String ppOffice,String gName, String sName,String dob,String mail,String loginId,String pwd, String cPwd ,String hQuestion,String hAnswer,String enterCD){
	/*	boolean isUserRegistered = false;
		boolean passportOfficeValid = false;
		boolean givenNameValid = false;
		boolean surNameValid = false;
		boolean dateOfbrithValid =false;
		boolean emailValid = false;
		boolean loginIdValid = false;
		boolean passWordValid = false;
		boolean confirmPasswordValid = false;
		boolean hintQuestionValid = false;
		boolean hintAnswerValid = false;
		boolean enterChractersDisplayedValid = false;
		
				if(ppOffice != null){
					passportOffice = ppOffice;
					passportOfficeValid = true;
				}else System.out.println("Passport office name is not valid");
				
				if(gName != null){
					givenName = gName;
					givenNameValid = true;
				}else System.out.println("Given name is not valid");
				
				if(sName != null){
					surName = sName;
					surNameValid = true;
				}else System.out.println("Sur name is not valid");
				
				if(dob != null){
					dateOfbrith = dob;
					dateOfbrithValid = true;
				}else System.out.println("date of brith is not valid");
				
				if(mail != null){
					email = mail;
					emailValid = true;
				}else System.out.println("email id is not valid");
				
				if(loginId != null){
					loginIdValid = true;
				}else System.out.println("login Id is not valid");
				
				if(pwd != null){
					passWord = pwd;
					passWordValid = true;
				}else System.out.println("Provide a valid password");
				
				if(cPwd != null && pwd == cPwd){
					confirmPassword = cPwd;
					confirmPasswordValid = true;
				}else System.out.println("confirm password is not same as passWord");
				
				if(hQuestion != null){
					hintQuestion = hQuestion;
					hintQuestionValid = true;
				}else System.out.println("hint Question is not valid");
				
				if(hAnswer != null){
					hintAnswer = hAnswer;
					hintAnswerValid = true;
				}else System.out.println("hint Answer is not valid");
				
				if(enterCD != null){
					enterChractersDisplayed = enterCD;
					enterChractersDisplayedValid = true;
				}else System.out.println("enter Chracters Displayed is not valid");
				
				if(passportOfficeValid && givenNameValid && surNameValid && dateOfbrithValid && emailValid && loginIdValid && passWordValid && confirmPasswordValid && hintQuestionValid && hintAnswerValid && enterChractersDisplayedValid){
					System.out.println("All the details(passportOffice,givenName,surName,dateOfbrith,email, loginId,passWord,confirmPassword,hintQuestion,hintAnswer,enterChractersDisplayed)are valid");
					isUserRegistered = true;
				}*/
				
				
				boolean isUserRegistered = false;
				
				boolean isUserValidate=PassportSevaValidator.validatePassportUser(ppOffice,gName,sName,dob,mail,loginId,pwd,cPwd ,hQuestion,hAnswer, enterCD);
				if(isUserValidate==true)
					isUserRegistered=true;
				else System.out.println("User is not validator and registered successfully");
			
				return isUserRegistered;
	}


	
     public static void getUserInfo(){
	passportOffice=PassportSevaValidator.passportOffice;
	givenName=PassportSevaValidator.givenName;
	surName=PassportSevaValidator.surName;
	dateOfbrith=PassportSevaValidator.dateOfbrith;
	email=PassportSevaValidator.email;
	loginId=PassportSevaValidator.loginId;
	passWord=PassportSevaValidator.passWord;
	confirmPassword=PassportSevaValidator.confirmPassword;
	hintQuestion=PassportSevaValidator.hintQuestion;
	hintAnswer=PassportSevaValidator.hintAnswer;
	enterChractersDisplayed = PassportSevaValidator.enterChractersDisplayed;
	 
		 System.out.println("the passport Office is: "+passportOffice);
		 System.out.println("the given name is: "+givenName);
		 System.out.println("the Sur name is: "+surName);
		 System.out.println("the date of brith is: "+dateOfbrith);
		 System.out.println("the email id is: "+email);
		 System.out.println("the loginId is: "+loginId);
		 System.out.println("the password is: "+passWord);
		 System.out.println("the confirm passWord is same as passWord: "+confirmPassword);
		 System.out.println("the hint question is: "+hintQuestion);
		 System.out.println("the hint answer is: "+hintAnswer);
		 System.out.println("the enter character displayed: "+enterChractersDisplayed);
		
	}

}