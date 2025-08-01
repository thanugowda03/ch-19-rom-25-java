class City{

	String cityName;
	String mayOrName;
	int population;
	String famousFor;
	boolean isTrain;
	
	City(String cityName,String mayOrName,int population,String famousFor,boolean isTrain){
		this.cityName = cityName;
		this.mayOrName = mayOrName;
		this.population = population;
		this.famousFor = famousFor;
		this.isTrain = isTrain;
	}
	
	public void getCityInfo(){
	
		System.out.println("City name: "+cityName);
		System.out.println("City mayOrName: "+mayOrName);
		System.out.println("City population: "+population);
		System.out.println("City famousFor: "+famousFor);
		System.out.println("City isTrain: "+isTrain);
	}
}