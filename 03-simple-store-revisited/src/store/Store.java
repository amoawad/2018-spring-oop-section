package store;

public class Store {

    private Product[] products;
    private String name;
    private int index;

    public Store(String name) {
        this.name = name;
        this.products = new Product[100];
        this.index = 0;
    }

    void addProduct(Product product) {
        products[index++] = product;
    }

    public Product[] getProducts() {
        return products;
    }
}
