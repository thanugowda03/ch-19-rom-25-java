class Blade {
	
	Blade() {
		System.out.println("The Blade Cons is invoked");
	}
Blade(int bladeId,double price,String brand,String type,String colour,String countryOfOrigin){
	
	System.out.println("The Blade parameterized cons is invoked");
	this.bladeId = bladeId;
	this.price=price;
	this.brand=brand;
	this.type=type;
	this.colour=colour;
	this.countryOfOrigin=countryOfOrigin;
}
    int bladeId;
    double price;
    String brand;
    String type;
    String colour;
    String countryOfOrigin;

public void getBladeInfo(){
	System.out.println("The Blade Id : " + bladeId);
    System.out.println("Price of blade is : " + price);
    System.out.println("Brand of Blade is : " +brand);
    System.out.println("Type of blade is : " + type);
    System.out.println("Blade colour is : " + colour);
    System.out.println("Country of origin : " +countryOfOrigin);
}
}
