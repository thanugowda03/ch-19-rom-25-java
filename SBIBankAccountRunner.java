class SBIBankAccountRunner{
	 public static void main(String[] details){
	 boolean isAccountRegistered = SBIBankAccount.registerAccount("Thanushree","B G","Gopalakrishna","18/04/2003","female",9483526695L,"thanugowda018@gmail.com","Madikeri TQ-Kodagu");
	 System.out.println("Bank Account details "+isAccountRegistered);
	 SBIBankAccount.getAccountDetails();
	 }
}