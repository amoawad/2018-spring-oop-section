package store;

public class Seller {

    private String name;
    private Store store;

    public Seller(String name, Store store) {
        this.name = name;
        this.store = store;
    }

    public void addProductToStore(String name, double price) {
        store.addProduct(new Product(name, price));
    }

}
