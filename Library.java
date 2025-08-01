class Library{
	
	String libraryName;
	String location;
	int numberOfBooks;
	String librarianName;
	boolean isOpen;
	Shelf shelf;
	
	Library(String libraryName,String location,int numberOfBooks,String librarianName,boolean isOpen,Shelf shelf){
		System.out.println("library constructor all parameter invoked");
		this.libraryName = libraryName;
		this.location = location;
		this.numberOfBooks = numberOfBooks;
		this.librarianName = librarianName;
		this.isOpen = isOpen;
		this.shelf = shelf;
	}
	
	public void getLibraryInfo(){
		
		System.out.println("Library name is: "+libraryName);
		System.out.println("Library location is: "+location);
		System.out.println("Number of Books in library: "+numberOfBooks);
		System.out.println("Librarian name is: "+librarianName);
		System.out.println("Library is open: "+isOpen);
		System.out.println("Shelf information: ");
		this.shelf.getShelfInfo();
	}
	
	

} 