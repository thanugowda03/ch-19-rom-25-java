class Blazer{

Blazer(){
	System.out.println("The Blazer Cons is invoked");
}
Blazer(int blazerId,double price,String brand,String style,String colour,String countryOfOrigin){
	System.out.println("The Blazer parameterized cons is invoked");
	this.blazerId = blazerId;
	this.price=price;
	this.brand=brand;
	this.style=style;
	this.colour=colour;
	this.countryOfOrigin=countryOfOrigin;
}
int blazerId;
double price;
String brand;
String style;
String colour;
String countryOfOrigin;

public void getBlazerInfo() {
System.out.println("The Blazer Id :"+blazerId);
System.out.println("Price of blazer is :"+price);
System.out.println("Brand of Blazer is :"+brand);
System.out.println("Style of blazer is :"+style);
System.out.println("Blzer colour is :"+colour);
System.out.println("Country of origin : "+countryOfOrigin);
	
	
	
}

}