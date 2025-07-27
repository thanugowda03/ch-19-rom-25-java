class Jewellery {
	
	Jewellery(){
		System.out.println("The Jewellery Cons is invoked");
	}
	Jewellery(int jewelleryId,String name,String type,double price,String material,String brand,String countryOfOrigin){
		this.jewelleryId=jewelleryId;
		this.name=name;
		this.type=type;
		this.price=price;
		this.material=material;
		this.brand=brand;
		this.countryOfOrigin=countryOfOrigin;
	}
    int jewelleryId;
    String name;
    String type;
    double price;
    String material;
    String brand;
    String countryOfOrigin;
	
	public void getJewelleryInfo() {
	System.out.println("Jewellery ID: " + jewelleryId);
    System.out.println("Name: " + name);
    System.out.println("Type: " + type);
    System.out.println("Price: " +price);
    System.out.println("Material: " + material);
    System.out.println("Brand: " + brand);
    System.out.println("Country of Origin: " +countryOfOrigin);
}
}
