class PassportSevaRunner{
	public static void main(String[] seva){
		System.out.println("main started");
	
	boolean userIsRegistered = PassportSeva.registerUser("Benglore","BaBa", "Das","15-02-19997","babadas12@gmail.com","Baba1234","Baba@12","Baba@12","your birth place","benglore","15RC0K");
	System.out.println("Is user registered "+ userIsRegistered);
	
	/*boolean userIsRegistered = PassportSeva.registerUser(null, "Das","Baba@12","Baba@12");
	System.out.println("Is user registered "+ userIsRegistered);*/
	
	if(userIsRegistered)
		PassportSeva.getUserInfo();
	
	System.out.println("main ended");
	}
}