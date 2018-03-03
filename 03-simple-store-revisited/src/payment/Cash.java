package payment;

public class Cash implements PaymentMethod {

    private double balance;

    public Cash(double balance) {
        this.balance = balance;
    }

    @Override
    public void pay(double amount) {
        if(amount <= balance) {
            balance -= amount;
            System.out.println("Pay: " + amount + " using cash");
        } else {
            System.out.println("Not enough cash");
        }
    }

}
