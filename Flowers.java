class Flowers {
	Flowers() {
		System.out.println("The flower cons is invoked");
	}
	 public Flowers(int flowerId, String name, String color, String fragrance, String season, double price, String origin) {
        this.flowerId = flowerId;
        this.name = name;
        this.color = color;
        this.fragrance = fragrance;
        this.season = season;
        this.price = price;
        this.origin = origin;
    }
    int flowerId;
    String name;
    String color;
    String fragrance;
    String season;
    double price;
    String origin;
    
    public void getFlowerInfo() {
        System.out.println("The flower id is " + flowerId);
        System.out.println("The flower name is " + name);
        System.out.println("The flower color is " + color);
        System.out.println("The flower fragrance is " + fragrance);
        System.out.println("The flower season is " + season);
        System.out.println("The flower price is " + price);
        System.out.println("The flower origin is " + origin);
	
}
}