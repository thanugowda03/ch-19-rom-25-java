public class GmailAccountRunner {
	public static void main(String[] details) {
		boolean isGmailRegistered = GmailAccount.registerGmail("Sneha", "Patil", "02-08-2001", "Female", 9980456385L, "sneha@123");

		System.out.println("Gmail Account open "+isGmailRegistered);
		GmailAccount.getGmailAccountInfo();
	}
}