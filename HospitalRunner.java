class HospitalRunner{
	
	public static void main(String details[]){
	
		System.out.println("main started");
		
		Doctor doctor = new Doctor(101,"Dr. Suresh Kumar","Neurologist",12,true);
		
		Department department = new  Department(1,"Neurologist",2,"Dr. Rekha",8,doctor);
		
		Hospital hospital = new Hospital("Nanjappa","Shivmogga",10,"080-12345678",department);
		
		hospital.getHospitalInfo();
		
		System.out.println("main ended");
	}
}