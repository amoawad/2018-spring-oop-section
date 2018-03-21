package generics;

public class GenericsMain {

    public static void main(String[] args) {

        Box<Wood> woodBox = new Box<>(new Wood());
        Box<Glass> glassBox = new Box<>(new Glass());

        woodBox.print();
        glassBox.print();
    }

}
