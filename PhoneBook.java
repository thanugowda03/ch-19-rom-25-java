class PhoneBook {

String phoneBookOwner;
int totalContacts;
String storageLocation;
Contact contact;

PhoneBook(String phoneBookOwner,int totalContacts,String storageLocation,Contact contact){
this.phoneBookOwner=phoneBookOwner;
this.totalContacts=totalContacts;
this.storageLocation=storageLocation;
this.contact=contact;

}
public void getPhoneBookInfo(){

System.out.println("PhoneBook owner "+phoneBookOwner);
System.out.println("Total number of contacts "+totalContacts);
System.out.println("Storage Location "+storageLocation);
System.out.println("Contact");
this.contact.getContactInfo();
}
}