package com.Account;


public class Account {

    String accountID;

    long balance;

    public Account(String accountID, long balance){
        this.accountID = accountID;
        this.balance = balance;
    }

    public long getBalance(){
        return balance;
    }


}
