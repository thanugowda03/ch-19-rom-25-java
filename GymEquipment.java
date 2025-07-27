class GymEquipment {
	GymEquipment()
	{
		System.out.println("The Gym Equipment Cons is invoked");
	}
	GymEquipment(int equipmentId, String name,String type,double price,String brand,String material,String countryOfOrigin ){
	System.out.println("The Gym Equipment parameterized cons is invoked");
	this.equipmentId=equipmentId;
	this.name=name;
	this.type=type;
	this.price=price;
	this.brand=brand;
	this.material=material;
	this.countryOfOrigin=countryOfOrigin;
	}
    int equipmentId;
    String name;
    String type;
    double price;
    String brand;
    String material;
    String countryOfOrigin;

	public void getEquipmentInfo(){
		
    System.out.println("Equipment ID: " +equipmentId);
    System.out.println("Name: " +name);
    System.out.println("Type: " + type);
    System.out.println("Price: " + price);
    System.out.println("Brand: " + brand);
    System.out.println("Material: " + material);
    System.out.println("Country of Origin: " + countryOfOrigin);
	}
	
}
