class EcommerceRunner{
	
	public static void main(String details[]){
	
	System.out.println("main started");
	
	Product product = new Product("Samsung washing machine","Samsung",21999.0,true,4.3);
	
	Category category = new Category("Home Appliances",2300,"Ravi Malhotra","Essentials",product);
	
	Ecommerce ecommerce = new Ecommerce("Flipkart","Kalyan Krishnamurthy",150000,"Bengaluru",category);
	
	ecommerce.getEcommerceInfo();
	
	System.out.println("main ended");
	}
}