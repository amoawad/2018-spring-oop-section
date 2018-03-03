import buyer.Customer;
import buyer.PremiumCustomer;
import payment.PayPal;
import store.Product;
import store.Seller;
import store.Store;

public class ShoppingMain {

    public static void main(String[] args) {

        Store store = new Store("Koshk 3m Ahmed");
        Seller seller = new Seller("3m Ahmed", store);
        Customer customer = new Customer("Aya");

        seller.addProductToStore("Gebna", 10);
        seller.addProductToStore("Zatoon", 5);
        seller.addProductToStore("7alawa", 7);

        Product[] products = store.getProducts();

        customer.purchase(products[0]);
        customer.purchase(products[1]);
        customer.purchase(products[2]);

        double totalPrice = customer.checkout();

        System.out.println("Customer: " + customer.getName() + " should pay: " + totalPrice);

        customer.pay(totalPrice);

        PremiumCustomer premiumCustomer = new PremiumCustomer("Soad");

        premiumCustomer.purchase(products[0]);
        premiumCustomer.purchase(products[1]);
        premiumCustomer.purchase(products[2]);

        totalPrice = premiumCustomer.checkout();

        double discountedPrice = premiumCustomer.getDiscountedPrice(totalPrice);

        System.out.println("Premium Customer: " + premiumCustomer.getName() + " should pay: " + discountedPrice);

        premiumCustomer.pay(discountedPrice);

        PremiumCustomer premiumCustomer2 = new PremiumCustomer("Soad");
        premiumCustomer2.setPaymentMethod(new PayPal());
        
        premiumCustomer2.purchase(products[0]);
        premiumCustomer2.purchase(products[1]);
        premiumCustomer2.purchase(products[2]);

        totalPrice = premiumCustomer.checkout();

        discountedPrice = premiumCustomer2.getDiscountedPrice(totalPrice);

        System.out.println("Premium Customer: " + premiumCustomer2.getName() + " should pay: " + discountedPrice);

        premiumCustomer2.pay(discountedPrice);

    }

}
