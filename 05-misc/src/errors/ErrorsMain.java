package errors;

public class ErrorsMain {

    public static void main(String[] args) {

        int[] arr = new int[10];

        System.out.println("Element number 3 is: " + arr[2]); // this will execute OK

        System.out.println("Element number 20 is: " + arr[19]); // this will cause an ArrayOutOfBoundException

        try {
            System.out.println("Element number 21 is" + offendingMehtod(arr)); // because this throughs an exception
                                                                               // we wrapped it inside a try-catch block
        } catch (Exception e) {
            //TODO: handle exception
        }

    }

    public static int offendingMehtod(int[] arr) throws Exception {
        return arr[20];
    }

}
