public class Payment {
    public static void main(String[] args){
        BankPayment bt = new BankTransfer();
        bt.pay("Mamun", "Dayan");

        DigitalPayment bkashPay = new BkashPay();
        BankPayment adapter = new PaymentAdapter(bkashPay);
        adapter.pay("Mamun", "Dayan");

        DigitalPayment nagadPay = new NagadPay();
        adapter = new PaymentAdapter(nagadPay);
        adapter.pay("Mamun", "Dayan");
    }
}
