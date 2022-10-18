package com.Account;


public class Transfer {

    Account senderAccount;
    Account receiverAccount;
    long balance;
    public void transfer(String Sender, String receiver, long balance){
        senderAccount = AccountOperations.findAccountForUser(Sender);
        receiverAccount = AccountOperations.findAccountForUser(receiver);

        setBalance(senderAccount);
        credit(balance);

        setBalance(receiverAccount);
        debit(balance);
    }

    private void setBalance(Account account){
        balance = account.getBalance();
    }

    public void credit(long credit){
        balance -= credit;
    }

    public void debit(long debit){
        balance+=  debit;
    }
}
