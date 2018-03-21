package generics;

public class Box<T> {

    T material;

    public Box(T material) {
        this.material = material;
        java.util.List list;
    }

    public void print() {
        System.out.println(material);
    }

}
