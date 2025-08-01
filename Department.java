class Department{

	int departmentId;
	String departmentName;
	int floorNumber;
	String headofDepartment;
	int numberofDoctors;
	Doctor doctor;
	
	Department(int departmentId,String departmentName,int floorNumber,String headofDepartment,int numberofDoctors,Doctor doctor){
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.floorNumber = floorNumber;
		this.headofDepartment = headofDepartment;
		this.numberofDoctors = numberofDoctors;
		this.doctor = doctor;
	}
	
	public void getDepartmentInfo(){
	
		System.out.println("Department id: "+departmentId);
		System.out.println("Department name: "+departmentName);
		System.out.println("Floor number: "+floorNumber);
		System.out.println("Head of department: "+headofDepartment);
		System.out.println("Number os doctors in department: "+numberofDoctors);
		System.out.println("Doctor information: ");
		this.doctor.getDoctorInfo();
	}
}