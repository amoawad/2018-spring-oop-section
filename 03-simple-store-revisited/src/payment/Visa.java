package payment;

public class Visa implements PaymentMethod {

    @Override
    public void pay(double amount) {
        connectToBank();
        if(checkIfCustomerCanOay(amount)) {
            performTransaction(amount);
        } else {
            System.out.println("Bank declined transaction");
        }
    }

    private void performTransaction(double amount) {
        System.out.println("Placing transaction");
    }

    private void connectToBank() {
        System.out.println("Connecting to bank");
    }

    private boolean checkIfCustomerCanOay(double amount) {
        // ...
        return true;
    }
    
}
