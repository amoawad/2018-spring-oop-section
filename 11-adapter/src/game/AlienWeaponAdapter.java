package game;

public class AlienWeaponAdapter implements Weapon {

    AlienWeapon alienWeapon;

    public AlienWeaponAdapter(AlienWeapon alienWeapon) {
        this.alienWeapon = alienWeapon;
    }

    @Override
    public void fire() {
        this.alienWeapon.cutWithLaser();
    }
}
