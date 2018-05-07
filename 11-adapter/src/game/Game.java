package game;

public class Game {

    public static void main(String[] args) {

        Hero hero = new Hero();
        Weapon gun = new Gun();

        hero.setWeapon(gun);
        hero.fight();

        AlienWeapon alienWeapon = new AlienWeapon();
        AlienWeaponAdapter alienWeaponAdapter = new AlienWeaponAdapter(alienWeapon);
        hero.setWeapon(alienWeaponAdapter);
        hero.fight();

    }

}
