public class BankTransfer implements BankPayment{
    @Override
    public void pay(String sender, String receiver){
        System.out.println("Paying from "+ sender + " to " + receiver);
    }
}
