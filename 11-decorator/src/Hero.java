public class Hero {

    Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void fight() {
        System.out.println("Dramatic effect: " + weapon.makeNoise());
        System.out.println("Damage: " + weapon.fire());
    }
}
