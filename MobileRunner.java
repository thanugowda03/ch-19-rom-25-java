class MobileRunner{

public static void main(String details[]){
Contact contact=new Contact("Thanushree",9483526695L,"Family");
PhoneBook phonebook=new PhoneBook("Vikhyath",200,"Google cloud",contact);
Mobile mobile=new Mobile("Samsung","Galaxy S23 Ultra","256GB",phonebook);

mobile.getMobileInfo();

}
}