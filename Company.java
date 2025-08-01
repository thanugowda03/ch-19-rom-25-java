class Company{

	String companyName;
	String industryType;
	String ceoName;
	int employeeCount;
	boolean isHiring;
	
	Company(String companyName,String industryType,String ceoName,int employeeCount,boolean isHiring){
		this.companyName = companyName;
		this.industryType = industryType;
		this.ceoName = ceoName;
		this.employeeCount =employeeCount;
		this.isHiring = isHiring;
	}
	
	public void getCompanyInfo(){
	
		System.out.println("Company name: "+companyName);
		System.out.println("Industry type: "+industryType);
		System.out.println("Company CEO name: "+ceoName);
		System.out.println("Company employeeCount: "+employeeCount);
		System.out.println("Company isHiring: "+isHiring);
	}
}