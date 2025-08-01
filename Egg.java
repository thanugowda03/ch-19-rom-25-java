class Egg{

int eggId;
String type;
double price;
boolean isOrganic;
String color;
boolean isFertilized;


	Egg(){
	this(1,10.0);
	System.out.println("Egg default constructor invoked");
	}
	
	Egg(int eggId,double price) {
	this.("Chicken",true);
	System.out.println("Egg constructor with(String,double) parameter invoked");
	this.eggId=eggId;
	this.price=price;
	}
	
	Egg(String type,boolean isOrganic){
	this("White",false);
    System.out.println("Egg constructor with(String,boolean) invoked");
    this.type=type;
    this.isOrganic=isOrganic;
	}
	
	Egg(String color, boolean isFertilized){
	this(2,true, "White");
	System.out.println("Egg constructor with(string,boolean) invoked");
	this.color=color;
	this.isFertilized=isFertilized;
	}
	
	Egg(int eggId, String type, double price, boolean isOrganic, String color, boolean isFertilized){
	this(1,true,"brown");
	System.out.println("Egg constructor with all parameters invoked");
	this.eggId=eggId;
	this.price=price;
	this.type=type;
    this.isOrganic=isOrganic;
	this.color=color;
	this.isFertilized=isFertilized;
}

    Egg(int eggId,boolean isOrganic, String color){
	this(12.0,false);
	System.out.println("Egg constructor with (int,boolean) invoked");
	this.eggId=eggId;
	this.isOrganic=isOrganic;
	this.color=color;
	}
	
	Egg(double price,boolean isFertilized){
	System.out.println("Egg constructor with (int,boolean) is invoked");
	this.price=price;
	this.isFertilized=isFertilized;
	
	}
	public void getEggDetails(){
    System.out.println("Egg Id "+eggId);
	System.out.println("Egg type "+type);
	System.out.println("Egg is organic "+isOrganic);
	System.out.println("Egg color "+color);
	System.out.println("Egg is Fertilized "+isFertilized);
	}
}