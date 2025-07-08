class BankAccount{
public static void debit(double amount){
   System.out.println("Debit started");
    boolean check = amount <100.00;
   if(check){
	   BankAccountRunner.balance=BankAccountRunner.balance-amount;
	      System.out.println("The current balance is "+BankAccountRunner.balance);

   }
   else{
	   System.out.println("Debit amount should be less than zero");
   }
   System.out.println("Debit ended");
} 

public static void credit(double amount){
   System.out.println("Credit started");
   boolean check=amount>=100.00;
   if(check){
	   BankAccountRunner.balance=BankAccountRunner.balance+amount;
	      System.out.println("The current balance is "+BankAccountRunner.balance);

   }
   else{
	   System.out.println("Credit amount should be greater than zero");
   }
   System.out.println("Credit ended");
}  
}