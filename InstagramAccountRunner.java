class InstagramAccountRunner {
    public static void main(String[] details) {
		System.out.println("main started");
        boolean isRegistered = InstagramAccount.registerInstagram("_thanu_gowda_", "Thanushree B G", "18-04-2003", "Female", 9876543210L, "Thanu@insta");
		
		System.out.println("Is registerInstagram "+isRegistered);
		InstagramAccount.getInstagramAccountInfo();
        System.out.println("main ended");
    }
}