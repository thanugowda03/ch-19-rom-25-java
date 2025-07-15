public class YouTubeAccountRunner {
	public static void main(String[] details) {
		boolean isAccountCreated = YouTubeAccount.registerAccount("Anusha", "Ram", "15-04-2002", "Female", 9876543210L, "anushram12@gmail.com", "AnushaVlogs");
	System.out.println("YouTube account create: "+isAccountCreated);
		YouTubeAccount.getChannelDetails();
	}
}