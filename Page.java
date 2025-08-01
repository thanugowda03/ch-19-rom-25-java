class Page{

	int pageNumber;
	String heading;
	String fontStyle;
	boolean hasImage;
	Article article;
	
	Page(int pageNumber,String heading,String fontStyle,boolean hasImage,Article article){
		this.pageNumber = pageNumber;
		this.heading = heading;
		this.fontStyle = fontStyle;
		this.hasImage = hasImage;
		this.article = article;
	}
	
	public void getPageInfo(){
	
		System.out.println("Page number: "+pageNumber);
		System.out.println("Page heading: "+heading);
		System.out.println("Page fontStyle: "+fontStyle);
		System.out.println("Page hasImage: "+hasImage);
		System.out.println("Article information: ");
		this.article.getArticleInfo();
	}
	
}