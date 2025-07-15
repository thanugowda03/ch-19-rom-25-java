class TelegramAccountRunner {
	public static void main(String[] details) {
		boolean isCreated = TelegramAccount.registerAccount("Thanushree", "B G", "2003-04-18", "Female", 9483526695L, "thanu123", "hiii");
		
		System.out.println("Telegram account create: "+isCreated);
		TelegramAccount.getAccountDetails();
	}
}