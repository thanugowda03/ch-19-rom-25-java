class Weapon {
	
	Weapon() {
		System.out.println("The Weapon cons is invoked");
	}
	Weapon(int weaponId,String name,String type,String originCountry,double weight,String material)
	{
		this.weaponId=weaponId;
		this.name=name;
		this.type=type;
		this.originCountry=originCountry;
		this.weight=weight;
		this.material=material;
	}
    int weaponId;
    String name;
    String type;
    String originCountry;
    double weight;
    String material;
	
	public void getWeaponInfo(){
	System.out.println("Weapon ID: " + weaponId);
    System.out.println("Name: " + name);
    System.out.println("Type: " + type);
    System.out.println("Origin Country: " + originCountry);
    System.out.println("Weight: " + weight);
    System.out.println("Material: " + material);
	}
}
