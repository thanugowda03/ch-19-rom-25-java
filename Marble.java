class Marble {
	Marble() {
		System.out.println("Marble cons is invoked");
	}
	Marble(int marbleId, String color, String material, double diameter, String pattern, String origin, double price) {
        this.marbleId = marbleId;
        this.color = color;
        this.material = material;
        this.diameter = diameter;
        this.pattern = pattern;
        this.origin = origin;
        this.price = price;
    }
	int marbleId;
	String color;
	String material;
	double diameter;
	String pattern;
	String origin;
	double price;
	
	public void getMarbleInfo() {
	System.out.println("The marble id is " + marbleId);
	System.out.println("The marble color is " +color);
	System.out.println("The marble material is " + material);
	System.out.println("The marble diameter is " + diameter);
	System.out.println("The marble pattern is " + pattern);
	System.out.println("The marble origin is " + origin);
	System.out.println("The marble price is " + price);
}
}