class Doctor{

	int doctorId;
	String doctorName;
	String specialization;
	int experienceYears;
	boolean isAvailable;
	
	Doctor(int doctorId, String doctorName, String specialization,int experienceYears,boolean isAvailable){
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.specialization = specialization;
		this.experienceYears = experienceYears;
		this.isAvailable = isAvailable;
		}
		
		public void getDoctorInfo(){
		
		System.out.println("Doctor id: "+doctorId);
		System.out.println("Doctor name: "+doctorName);
		System.out.println("Doctor specialization: "+specialization);
		System.out.println("Doctor experienceYears: "+experienceYears);
		System.out.println("Doctor is availble: "+isAvailable);
		}
}