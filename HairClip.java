class HairClip{
	HairClip() {
		System.out.println("Hairclip cons is invoked");
	}
	HairClip(int hairClipId, String brand, String color, String material, String type, double price) {
        this.hairClipId = hairClipId;
        this.brand = brand;
        this.color = color;
        this.material = material;
        this.type = type;
        this.price = price;
    }
    int hairClipId;
    String brand;
    String color;
    String material;
    String type;          
    double price;
	
    public void getHairClipInfo() {
        System.out.println("The hairClip id is " + hairClipId);
        System.out.println("The hairClip brand is " + brand);
        System.out.println("The hairClip color is " + color);
        System.out.println("The hairClip material is " + material);
        System.out.println("The hairClip type is " + type);
        System.out.println("The hairClip price is " + price);
    }
	
}