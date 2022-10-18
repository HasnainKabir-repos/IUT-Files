package com.Account;

import java.util.Map;

public class AccountOperations {

    public static Map<String, Account> accounts;
    public void addAccount(String ID, Account account){
        accounts.put(ID, account);
    }

    public void updateAccount(String ID,Account account){
        accounts.replace(ID, account);
    }

    public static Account findAccountForUser(String ID){

        return accounts.get(ID);

    }
}
