package buyer;

import store.Product;

public class Cart {

    private Product[] myProducts;
    private int index;

    public Cart() {
        this.myProducts = new Product[10];
        this.index = 0;
    }

    public void addToCart(Product p) {
        myProducts[index++] = p;
    }

    public double calcSum() {
        double result = 0;

        for(Product p : myProducts) {
            if(p == null) {
                break;
            }
            result += p.getPrice();
        }

        return result;
    }

}
