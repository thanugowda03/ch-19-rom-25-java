class Block{

	String blockName;
	int numberOfFloors;
	int totalOffices;
	String blockManager;
	Company company;
	
	Block(String blockName,int numberOfFloors,int totalOffices,String blockManager,Company company){
		this.blockName = blockName;
		this.numberOfFloors = numberOfFloors;
		this.totalOffices = totalOffices;
		this.blockManager = blockManager;
		this.company = company;
	}
	
	public void getBlockInfo(){
	
		System.out.println("Block name: "+blockName);
		System.out.println("Block numberOfFloors: "+numberOfFloors);
		System.out.println("Block totalOffices: "+totalOffices);
		System.out.println("Block blockManager: "+blockManager);
		System.out.println("Company infomation: ");
		this.company.getCompanyInfo();
	}

}