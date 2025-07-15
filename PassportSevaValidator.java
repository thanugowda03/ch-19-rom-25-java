class PassportSevaValidator {
 
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
	
public static boolean validatePassportUser(String ppOffice,String gName, String sName,String dob,String mail,String loginId,String pwd, String cPwd ,String hQuestion,String hAnswer,String enterCD) {
        boolean isUserValidate=false;		
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
					isUserValidate = true;
				}
                     return isUserValidate;


}

}




















