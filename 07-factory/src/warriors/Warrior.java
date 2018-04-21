package warriors;

import armies.Arsenal;
import weapons.Weapon;

public abstract class Warrior {

    Weapon mainWeapon;
    Weapon secondaryWeapon;

    public Warrior(Arsenal arsenal) {

    }

    public void putArmor() {
        System.out.println(this.getClass().getSimpleName() + ": Armor ON");
    }

    public void holdMainWeapon() {
        System.out.println(mainWeapon.getClass().getSimpleName());
    }
    public void holdSecondaryWeapon() {
        System.out.println(secondaryWeapon.getClass().getSimpleName());
    }
    
    public void march() {
        System.out.println(this.getClass().getSimpleName() + ": March");
    }

}
