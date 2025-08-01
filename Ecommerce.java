class Ecommerce{

	String platformName;         
    String ownerName;           
    int totalSellers;
    String headquartersLocation;
	Category category;
	
	Ecommerce(String platformName,String ownerName,int totalSellers,String headquartersLocation,Category category){
			this.platformName = platformName;
			this.ownerName = ownerName;
			this.totalSellers = totalSellers;
			this.headquartersLocation = headquartersLocation;
			this.category = category;
	}
	
	public void getEcommerceInfo(){
	
	System.out.println("Ecommerce platformName: "+platformName);
	System.out.println("Ecommerce ownerName: "+ownerName);
	System.out.println("Ecommerce totalSellers: "+totalSellers);
	System.out.println("Ecommerce headquartersLocation: "+headquartersLocation);
	System.out.println("Ecommerce category: "+category);
	this.category.getCategoryInfo();
	}
}