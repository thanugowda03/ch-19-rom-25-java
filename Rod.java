class Rod{
		Rod(){
			System.out.println("The Rod cons is invoked");
		}
		Rod(int rodId, String material, double length, double diameter, String color, double weight) {
        this.rodId = rodId;
        this.material = material;
        this.length = length;
        this.diameter = diameter;
        this.color = color;
        this.weight = weight;
    }

	int rodId;
    String material;     
    double length;        
    double diameter;     
    String color;         
    double weight; 
	
	public void getRodInfo(){
		
	System.out.println("The rod id is " + rodId);
	System.out.println("The rod material is " + material);
	System.out.println("The rod length is " + length);
	System.out.println("The rod diameter is " + diameter);
	System.out.println("The rod color is " + color);
	System.out.println("The rod weight is " + weight);

	}
} 