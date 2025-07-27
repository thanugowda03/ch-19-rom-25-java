class Crackers {
	Crackers()
	{
    System.out.println("The cracker cons is invoked");
	}
	Crackers(int crackerId, String name, String brand, String type,String color, double price, String effect) {
        this.crackerId = crackerId;
        this.name = name;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
        this.effect = effect;
	}
    int crackerId;
    String name;
    String brand;
    String type;
    String color;
    double price;
    String effect;
	
	public void getCrackersInfo() {
		System.out.println("The cracker id is " + crackerId);
		System.out.println("The cracker name is " + name);
		System.out.println("The cracker brand is " + brand);
		System.out.println("The cracker type is " + type);
		System.out.println("The cracker color is " +color);
		System.out.println("The cracker price is " + price);
		System.out.println("The cracker effect is " +effect);
	}
}
