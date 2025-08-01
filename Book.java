class Book{
	
	int bookId;
	String title;
	String author;
	int numberOfPages;
	
	Book(int bookId,String title,String author,int numberOfPages){
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.numberOfPages = numberOfPages;
	}
	public void getBookInfo(){
	
		System.out.println("Book id is: "+bookId);
		System.out.println("Book title is: "+title);
		System.out.println("Book author name is: "+author);
		System.out.println("Number of pages in book: "+numberOfPages);
	}
}