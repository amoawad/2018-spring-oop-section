package warriors;

import armies.Arsenal;

public class NorthMagician extends Warrior {


    public NorthMagician(Arsenal arsenal) {
        super(arsenal);

        mainWeapon = arsenal.getWand();
        secondaryWeapon = arsenal.getPotion();
    }
}
