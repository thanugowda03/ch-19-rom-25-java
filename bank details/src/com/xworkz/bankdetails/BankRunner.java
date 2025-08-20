package com.xworkz.bankdetails;

import com.xworkz.bankdetails.bank.Bank;

public class BankRunner {

    public static void main(String[] args) {
        System.out.println("main started");

        Bank bank = new Bank();
        bank.setBankId(12);
        bank.setBankName("SBI");
        bank.setAccountNo(625789466302l);
        bank.setLocation("Sullia");
        bank.setBalance(2000.00);

        int bankId = bank.getBankId();
        String bankName = bank.getBankName();
        long accountNo = bank.getAccountNo();
        String location = bank.getLocation();
        double balance = bank.getBalance();

        System.out.println("Bank Id: "+bankId);
        System.out.println("Bank name: "+bankName);
        System.out.println("Bank account number: "+accountNo);
        System.out.println("Bank location: "+location);
        System.out.println("Bank balance: "+balance);
        System.out.println("main ended");
    }
}
