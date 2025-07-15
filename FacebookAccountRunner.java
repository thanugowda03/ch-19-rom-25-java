class FacebookAccountRunner{
	public static void main(String[] details){
	
	boolean userIsRegistered = FacebookAccount.registerUser("Sama","Rajesh","16/02/2004","Female",9591268479l,"samarajesh23@gmail.com","sama@123");
	System.out.println("Is user Registered "+userIsRegistered);
	
	FacebookAccount.getUserInfo();
	
	}
}