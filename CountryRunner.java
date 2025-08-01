class CountryRunner{
	
	public static void main(String details[]){
	
	System.out.println("main started");
	
	City city = new City("Shivmoga","B.S Ragavendra",319000,"WaterFall",true);
	
	State state = new State("Karnataka","Siddaramiah",31,"Kannada",61130704l,city);
	
	Country country = new Country("India","New Delhi", "1.45 billion","Indian Rupee",state);
	
	country.getCountryInfo();

	System.out.println("main ended");
	}
}