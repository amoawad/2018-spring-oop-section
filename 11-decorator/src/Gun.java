public class Gun implements Weapon {

    int damage;
    String noise;

    public Gun() {
        damage = 10;
        noise = "RATAAAATATATTATAAAA";
    }

    @Override
    public String makeNoise() {
        return noise;
    }

    @Override
    public int fire() {
        return damage;
    }
}
