class TechPark {
	
	String techParkName;
	String location;
	int totalCompanies;
	int totalBlocks;
	Block block;
	
	TechPark(String techParkName,String location,int totalCompanies,int totalBlocks,Block block){
		this.techParkName = techParkName;
		this.location = location;
		this.totalCompanies = totalCompanies;
		this.totalBlocks = totalBlocks;
		this.block = block;
	}
	
	public void getParkInfo(){
	
	System.out.println("TechPark name: "+techParkName);
	System.out.println("TechPark location: "+location);
	System.out.println("TechPark totalCompanies: "+totalCompanies);
	System.out.println("TechPark totalBlocks: "+totalBlocks);
	System.out.println("Block information: ");
	this.block.getBlockInfo();
	}

}