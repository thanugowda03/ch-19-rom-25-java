class Article{

	int articleId;
	String title;
	String author;
	int publishedYear;
	
	Article(int articleId,String title,String author,int publishedYear){
		this.articleId = articleId;
		this.title = title;
		this.author = author;
		this.publishedYear = publishedYear;
	}
	
	public void getArticleInfo(){
	
		System.out.println("Article id: "+articleId);
		System.out.println("Article title: "+title);
		System.out.println("Article author: "+author);
		System.out.println("Article publishedYear: "+publishedYear);
	}
}