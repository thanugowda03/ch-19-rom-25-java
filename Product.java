class Product{
	
	String productName;          
    String brand;
    double price;
    boolean isInStock;
    double rating; 
	
	Product(String productName,String brand,double price,boolean isInStock,double rating){
		this.productName = productName;
		this.brand = brand;
		this.price = price;
		this.isInStock = isInStock;
		this.rating = rating;
	}
	
	public void getProductInfo(){
	
		System.out.println("Product name: "+productName);
		System.out.println("Product brand: "+brand);
		System.out.println("Product price: "+price);
		System.out.println("Product isInStock: "+isInStock);
		System.out.println("Product rating: "+rating);
	}
}