class Hospital {

	String hospitalName;
	String location;
	int numberOfDepartments;
	String contactNumber;
	Department department;
	
	Hospital(String hospitalName,String location,int numberOfDepartments,String contactNumber,Department department){
	this.hospitalName = hospitalName;
	this.location = location;
	this.numberOfDepartments = numberOfDepartments;
	this.contactNumber = contactNumber;
	this.department = department;
	}
	
	public void getHospitalInfo(){
			
		System.out.println("Hospital name: "+hospitalName);
		System.out.println("Hospital location: "+location);
		System.out.println("Number of department in hospital: "+numberOfDepartments);
		System.out.println("Hospital contactNumber is: "+contactNumber);
		System.out.println("Department information: ");
		this.department.getDepartmentInfo();
	}
}

