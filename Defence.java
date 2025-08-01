class Defence{

	String countryName;
    String defenceMinister;
    double annualBudget;      
    int totalForces;
    String headquarters; 
	Army army;
	
	Defence(String countryName,String defenceMinister,double annualBudget,int totalForces,String headquarters,Army army){
		this.countryName = countryName;
		this.defenceMinister = defenceMinister;
		this.annualBudget = annualBudget;
		this.totalForces = totalForces;
		this.headquarters = headquarters;
		this.army = army;
	}
	
	public void getDefenceInfo(){
	
		System.out.println("Defence countryName: "+countryName);
		System.out.println("Defence minister: "+defenceMinister);
		System.out.println("Defence annualBudget: "+annualBudget);
		System.out.println("Defence totalForces: "+totalForces);
		System.out.println("Defence headquarters: "+headquarters);
		System.out.println("Army information: ");
		this.army.getArmyInfo();
	}
}