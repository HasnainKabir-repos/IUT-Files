public class PaymentAdapter implements BankPayment{
    public DigitalPayment digitalPayment;

    public PaymentAdapter(DigitalPayment digitalPayment){
        this.digitalPayment = digitalPayment;
    }

    @Override
    public void pay(String sender, String receiver){
        digitalPayment.pay(receiver);
    }

}
