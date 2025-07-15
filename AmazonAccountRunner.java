class AmazonAccountRunner {
    public static void main(String[] details) {
        boolean isRegistered = AmazonAccount.registerAmazon("Sonu", "Sonu@gmail.com", "10-04-2003", "Female", 9597483150L, "Sonu@123");
		
		System.out.println("Amazon Account created "+isRegistered);
		AmazonAccount.getAmazonAccountInfo();
		
		System.out.println("main ended");
    }
	}