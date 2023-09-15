public class Main {
    public static void main(String[] args){
        BankTransfer bt = new BankTransfer();
        bt.pay("Mamun", "Dayan");

        BkashPay bkashPay = new BkashPay();
        PaymentAdapter adapter = new PaymentAdapter(bkashPay);
        adapter.pay("Mamun", "Dayan");

        NagadPay nagadPay = new NagadPay();
        adapter = new PaymentAdapter(nagadPay);
        adapter.pay("Mamun", "Dayan");
    }
}
