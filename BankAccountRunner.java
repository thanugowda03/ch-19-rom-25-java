class BankAccountRunner {
	static  double balance;
public static void main(String[] accounts){
	 System.out.println("main started");
	 
	 //methodName();
	 balance=0.00;
	 BankAccount.credit(100.00);
	 BankAccount.debit(500.00);
    

//Datatype variableName-parameter
//<access-specifier> returnType methodName(parameter)
 
 System.out.println("main ended");
}
}