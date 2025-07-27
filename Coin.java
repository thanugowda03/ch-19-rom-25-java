class Coin{
	Coin(){
	System.out.println("The Coin cons is invoked"); 
	}

    Coin(int coinId, String name, String country, int year, String metal, double value) {
        this.coinId = coinId;
        this.name = name;
        this.country = country;
        this.year = year;
        this.metal = metal;
        this.value = value;
	}
	
    int coinId;
    String name;
    String country;
    int year;
    String metal;
    double value;	
	public void getCoinInfo() {
	System.out.println("The coin id is " +coinId);
	System.out.println("The coin name is " +name);
	System.out.println("The coin country is " +country);
	System.out.println("Manufacatured year" +year);
	System.out.println("Metal used is " +metal);
	System.out.println("Value " +value);
	}
}