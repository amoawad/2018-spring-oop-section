import buyer.Customer;
import store.Product;
import store.Seller;
import store.Store;

public class ShoppingMain {

    public static void main(String[] args) {

        Store store = new Store("Koshk 3m Ahmed");
        Seller seller = new Seller("3m Ahmed", store);
        Customer customer = new Customer("Aya", 100);

        seller.addProductToStore("Gebna", 10);
        seller.addProductToStore("Zatoon", 5);
        seller.addProductToStore("7alawa", 7);

        Product[] products = store.getProducts();

        customer.purchase(products[0]);
        customer.purchase(products[1]);
        customer.purchase(products[2]);

        double totalPrice = customer.checkout();

        System.out.println("Customer: " + customer.getName() + " should pay: " + totalPrice);

    }

}
