class MagizineRunner{
	public static void main(String details[]){
	
	System.out.println("main started");
	
	Article article = new Article(12,"A life of Dedication","Dr. A P J Abdul Kalam",2000);
	
	Page page = new Page(25,"Life ","Times New Roman",true,article);
	
	Magizine magizine = new Magizine("Visionary Minds","Inspire India Publication","English",120.0,page);
	
	magizine.getMagizineInfo();
	
	System.out.println("main ended");
	}
}