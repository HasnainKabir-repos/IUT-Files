public class NagadPay implements DigitalPayment{
    @Override
    public void pay(String receiver) {
        System.out.println("Paying through Nagad to " + receiver);
    }
}
