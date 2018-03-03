package buyer;

import payment.PaymentMethod;
import payment.Visa;

public class PremiumCustomer extends Customer {

    public PremiumCustomer(String name) {
        super(name);
        this.paymentMethod = new Visa();
    }

    public double getDiscountedPrice(double originalPrice) {
        return originalPrice / 1.2;
    }

    public void setPaymentMethod(PaymentMethod p) {
        this.paymentMethod = p;
    }
    
}
