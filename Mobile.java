class Mobile {

String brand;
String model;
String storage;
PhoneBook phonebook;

Mobile(String brand,String model,String storage,PhoneBook phonebook)  {
this.brand=brand;
this.model=model;
this.storage=storage;
this.phonebook=phonebook;
}

public void getMobileInfo() {

System.out.println("Mobile brand "+brand);
System.out.println("Mobile model is "+model);
System.out.println("Mobile stoarge is "+storage);
System.out.println("Phone Book");
this.phonebook.getPhoneBookInfo();
}

}