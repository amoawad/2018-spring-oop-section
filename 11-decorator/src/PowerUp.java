public class PowerUp implements Weapon {

    Weapon weapon;

    public PowerUp(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String makeNoise() {
        return weapon.makeNoise();
    }

    @Override
    public int fire() {
        return weapon.fire() *2;
    }
}
