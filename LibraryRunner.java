class LibraryRunner{
	
	public static void main(String details[]){
	
		System.out.println("main started");
		
		Book book = new Book(121,"Wing of Fire","A P J Abdul Kalam",180);
		Shelf shelf = new Shelf(2,50,"Science",false,book);
		Library library = new Library("City Central Library","MG Road",1200,"Kavitha",true,shelf);
		library.getLibraryInfo();
		
		System.out.println("main ended");
	}
}