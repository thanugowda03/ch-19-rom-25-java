class SocialMedia {
	/*static String one = "Facebook";
	static String two = "You Tube";
	static String three = "Instagram";
	static String four = "TikTok";
	static String five = "WeChat";
	static String six = "Telegram";
	static String seven = "Snapchat";
	static String eight = "Twitter";
	static String nine = "Reddit";
static String mediaNames[] = {"Facebook","You Tube","WhatsApp","Instagram","TikTok","WeChat","Telegram","Snapchat","Twitter","Reddit"}; */

public static void main(String[] media){
	String one = "Facebook";
	String two = "You Tube";
	String three = "Instagram";
	String four = "TikTok";
	String five = "WeChat";
	String six = "Telegram";
	String seven = "Snapchat";
	String eight = "Twitter";
	String nine = "Reddit";
	String mediaNames[] = {one,two,three,four,five,six,seven,eight,nine};
		
	System.out.println("main started");
	System.out.println("Social Media names area ");
	//System.out.println(mediaNames[0] +" "+ mediaNames[1] +" "+ mediaNames[2] +" "+ mediaNames[3] +" "+ mediaNames[4] +" "+ mediaNames[5] +" "+ mediaNames[6] +" "+ mediaNames[7] +" "+ mediaNames[8] +" "+ mediaNames[9]);
	for(String mediaName : mediaNames){
	System.out.println(mediaName);
	}
    System.out.println("main ended");
}
}