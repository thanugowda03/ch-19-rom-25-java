class Hat {
	Hat(){
		System.out.println("Hat cons is invoked");
	}
	Hat(int hatId, String brand, String color, String material, String size, String style, double price) {
        this.hatId = hatId;
        this.brand = brand;
        this.color = color;
        this.material = material;
        this.size = size;
        this.style = style;
        this.price = price;
    }
    int hatId;
    String brand;
    String color;
    String material;
    String size;         
    String style;        
    double price;
	
    public void getHatInfo() {
        System.out.println("The hat id is " + hatId);
        System.out.println("The hat brand is " + brand);
        System.out.println("The hat color is " + color);
        System.out.println("The hat material is " + material);
        System.out.println("The hat size is " + size);
        System.out.println("The hat style is " + style);
        System.out.println("The hat price is " + price);
       
    }
}
    
