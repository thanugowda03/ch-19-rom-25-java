class DefenceRunner{

	public static void main(String details[]){
	
	System.out.println("main strted");
	
	Squad squad = new Squad("Black Cobra",12,"Counter Terroris",true,"Captain Vikram Sinha");
	
	Army army = new Army("Indian Army",1200000,"General Manoj Pande","Udhampur",squad);
	
	Defence defence = new Defence("India","Rajnath Singh",593537.64,1450000,"New Delhi",army);
	
	defence.getDefenceInfo();
	
	System.out.println("main ended");
	}
}