public class Main {

    public static void main(String[] args) {

        DatabaseConnection c1 = DatabaseConnection.getInstance();
        DatabaseConnection c2 = DatabaseConnection.getInstance();

        System.out.println(c1);
        System.out.println(c2);


    }

}
