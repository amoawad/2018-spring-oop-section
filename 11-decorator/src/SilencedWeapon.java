public class SilencedWeapon implements Weapon {

    Weapon weapon;

    public SilencedWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String makeNoise() {
        return "ssssssshhhhhhh(" + weapon.makeNoise().toLowerCase() + ")";
    }

    @Override
    public int fire() {
        return weapon.fire();
    }
}
