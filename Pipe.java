class Pipe {
	
	Pipe() {
		System.out.println("Pipe cons is invoked");
	}
Pipe(int pipeId,String material,double length,double diameter,String originCountry,String usage)
	{
		this.pipeId=pipeId;
		this.material=material;
		this.length=length;
		this.diameter=diameter;
		this.originCountry=originCountry;
		this.usage=usage;
	}
		
    int pipeId;
    String material;
    double length;       
    double diameter;      
    String originCountry;
    String usage;
	
	public void getPipeInfo() {
	System.out.println("Pipe ID: " + pipeId);
    System.out.println("Material: " + material);
    System.out.println("Length: " + length);
    System.out.println("Diameter: " + diameter);
    System.out.println("Origin Country: " + originCountry);
    System.out.println("Usage: " + usage);
	}


}