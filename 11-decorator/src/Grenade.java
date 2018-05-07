public class Grenade implements Weapon {

    @Override
    public String makeNoise() {
        return "BOOOOOM";
    }

    @Override
    public int fire() {
        return 50;
    }
}
