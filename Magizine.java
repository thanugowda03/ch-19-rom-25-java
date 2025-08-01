class Magizine{

	String magazineName;
	String publisher;
	String language;
	double price;
	Page page;
	
	Magizine(String magazineName,String publisher,String language,double price,Page page){
		this.magazineName = magazineName;
		this.publisher = publisher;
		this.language = language;
		this.price = price;
		this.page = page;
	}
	
	public void getMagizineInfo(){
	
		System.out.println("Magizine name: "+magazineName);
		System.out.println("Magizine publisher: "+publisher);
		System.out.println("Magizine language: "+language);
		System.out.println("Magizine price: "+price);
		System.out.println("Page information: ");
		this.page.getPageInfo();
	}

} 