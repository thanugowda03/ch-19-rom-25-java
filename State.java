class State{

	String stateName;
	String chisfMinister;
	int numberOfDistricts;
	String officialLanguage;
	long population;
	City city;
	
	State(String stateName,String chisfMinister,int numberOfDistricts,String officialLanguage,long population,City city){
		this.stateName = stateName;
		this.chisfMinister = chisfMinister;
		this.numberOfDistricts = numberOfDistricts;
		this.officialLanguage = officialLanguage;
		this.population = population;
		this.city = city;
	}
	
	public void getStateInfo(){
	
		System.out.println("State name: "+stateName);
		System.out.println("State chisfMinister: "+chisfMinister);
		System.out.println("Number os Disticts: "+numberOfDistricts);
		System.out.println("OfficialLanguage: "+officialLanguage);
		System.out.println("State population: "+population);
		System.out.println("City information: ");
		this.city.getCityInfo();
	}
}