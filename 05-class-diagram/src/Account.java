public abstract class Account {

    protected Client owner;
    protected int number;
    protected int balance;

    public void close() {
        // notify owner
    }

}
