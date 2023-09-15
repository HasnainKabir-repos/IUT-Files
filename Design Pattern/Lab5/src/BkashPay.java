public class BkashPay implements DigitalPayment{
    @Override
    public void pay(String receiver){
        System.out.println("Paying through Bkash to "+ receiver);
    }
}
