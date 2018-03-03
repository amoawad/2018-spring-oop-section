package buyer;

import payment.Cash;
import payment.PaymentMethod;
import store.Product;

public class Customer {

    private String name;
    private Cart cart;
    protected PaymentMethod paymentMethod;

    public Customer(String name) {
        this.name = name;
        this.cart = new Cart();
        this.paymentMethod = new Cash(100);
    }

    public void purchase(Product p) {
        cart.addToCart(p);
    }

    public double checkout() {
        return cart.calcSum();
    }

    public String getName() {
        return name;
    }

    public void pay(double amount) {
        paymentMethod.pay(amount);
    }
}
