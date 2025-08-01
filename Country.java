class Country{

	String countryName;
	String capitalCity;
	String population;
	String currency;
	State state;
	
	Country(String countryName,String capitalCity,String population,String currency,State state){
		this.countryName = countryName;
		this.capitalCity = capitalCity;
		this.population = population;
		this.currency = currency;
		this.state = state;
	}
	
	public void getCountryInfo(){
	
		System.out.println("Country name: "+countryName);
		System.out.println("Country capitalCity: "+capitalCity);
		System.out.println("Country population: "+population);
		System.out.println("Country currency: "+currency);
		System.out.println("State information: ");
		this.state.getStateInfo();
	}
}
