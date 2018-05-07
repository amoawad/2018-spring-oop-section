public class Game {

    public static void main(String[] args) {

        Hero hero = new Hero();

        Weapon gun = new Gun();
        Weapon grenade = new Grenade();

        Weapon silencedGun = new SilencedWeapon(gun);
        Weapon powerUpGun = new PowerUp(gun);

        Weapon silentPowerUpGun = new PowerUp(new SilencedWeapon(gun));

        Weapon powerUpGenerade = new PowerUp(grenade);

        hero.setWeapon(gun);
        hero.fight();
        System.out.println("----------");

        hero.setWeapon(silencedGun);
        hero.fight();
        System.out.println("----------");

        hero.setWeapon(powerUpGun);
        hero.fight();
        System.out.println("----------");

        hero.setWeapon(silentPowerUpGun);
        hero.fight();
        System.out.println("----------");

        hero.setWeapon(powerUpGenerade);
        hero.fight();
        System.out.println("----------");


    }

}
