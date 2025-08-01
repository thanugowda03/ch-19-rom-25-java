class Shelf{

	int shelfNumber;
	int capacity;
	String category;
	boolean isWooden;
	Book book;
	
	Shelf(int shelfNumber,int capacity,String category,boolean isWooden,Book book){
		this.shelfNumber = shelfNumber;
		this.capacity = capacity;
		this.category = category;
		this.isWooden = isWooden;
		this.book = book;
	}
	public void getShelfInfo(){
	
		System.out.println("Shelf number is: "+shelfNumber);
		System.out.println("Shelf capacity is: "+capacity);
		System.out.println("Shelf category is: "+category);
		System.out.println("Shelf is wooden: "+isWooden);
		System.out.println("Book information: ");
		this.book.getBookInfo();
	}
}