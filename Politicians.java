class Politicians {

	String name;
	int age;
	String party;
	String position;
	
	Politicians(String name,int age,String party,String position){
		this.name = name;
		this.age = age;
		this.party = party;
		this.position = position;
	}
	
	public void getPoliticiansInfo(){
	
		System.out.println("Politician name: "+name);
		System.out.println("Politician age: "+age);
		System.out.println("Politician party: "+age);
		System.out.println("Politician position: "+position);
	}
}