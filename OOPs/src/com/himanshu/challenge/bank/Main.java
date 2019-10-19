package com.himanshu.challenge.bank;

public class Main {
  
    public static void main(String[] args) {
    
    Account kpAccount = new Account(); //"5134903",100.0,"Himanshu Kandpal","himanshukp324@gmail.com","(91) 9582504526"
//    kpAccount.withdrawFunds(199.9);    
    
    System.out.println(kpAccount.getCustomerName());
    System.out.println(kpAccount.getBalance());
           
    kpAccount = new Account("5134903",100.0,"Himanshu Kandpal","himanshukp324@gmail.com","(91) 9582504526");
    
    System.out.println(kpAccount.getCustomerName());
    System.out.println(kpAccount.getBalance());
       
    kpAccount.depositFunds(404.99);
    kpAccount.withdrawFunds(200);
  
    kpAccount.depositFunds(4.99);
    kpAccount.withdrawFunds(200);
  
    kpAccount.depositFunds(4.99);
    kpAccount.withdrawFunds(200);
  
    Account himAccount = new Account("Him","ak@gmail.com","9988558899");
    System.out.println(himAccount.getAccountNumber()+" name " + himAccount.getCustomerName());
  }

}
