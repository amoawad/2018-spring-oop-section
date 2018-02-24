package buyer;

import store.Product;

public class Customer {

    private String name;
    private int balance;
    private Cart cart;

    public Customer(String name, int balance) {
        this.name = name;
        this.balance = balance;
        this.cart = new Cart();
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
}
