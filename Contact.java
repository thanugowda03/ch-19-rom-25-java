class Contact  {

String contactName;
long contactNumber;
String contactGroup;

Contact(String contactName,long contactNumber,String contactGroup){
this.contactName=contactName;
this.contactNumber=contactNumber;
this.contactGroup=contactGroup;
}

public void getContactInfo() {
System.out.println("Contact Name is "+contactName);
System.out.println("Contact Number is "+contactNumber);
System.out.println("Contact group is "+contactGroup);
}
}