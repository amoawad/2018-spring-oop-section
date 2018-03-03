package payment;

public class PayPal implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Connect to paypal.com");
    }

}
