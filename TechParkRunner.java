class TechParkRunner{

	public static void main(String details[]){
	
	System.out.println("main started");
	
	Company company = new Company("Infosys Ltd","IT service","Salil Parekh",200000,true);
	
	Block block = new Block("Alpha Block",10,25,"Ranju",company);
	
	TechPark techPark = new TechPark("Manyata TechPark","Bengalur",12,50,block);
	
	techPark.getParkInfo();
	
	System.out.println("main ended");
	} 
}