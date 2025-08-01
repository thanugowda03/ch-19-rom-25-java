class Category{

    String categoryName;          
    int numberOfProducts;
    String departmentHead;
    String mainTag;       
	Product product;
	
	Category(String categoryName,int numberOfProducts,String departmentHead,String mainTag,Product product){
		this.categoryName = categoryName;
		this.numberOfProducts = numberOfProducts;
		this.departmentHead = departmentHead;
		this.mainTag = mainTag;
		this.product = product;
	}
	
	public void getCategoryInfo(){
	
		System.out.println("Category name: "+categoryName);
		System.out.println("Category numberOfProducts: "+numberOfProducts);
		System.out.println("Category departmentHead: "+departmentHead);
		System.out.println("Category mainTag: "+mainTag);
		System.out.println("Product infomation: ");
		this.product.getProductInfo();
	}
}