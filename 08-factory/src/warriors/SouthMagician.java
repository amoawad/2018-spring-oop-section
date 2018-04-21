package warriors;

import armies.Arsenal;

public class SouthMagician extends Warrior {
    public SouthMagician(Arsenal arsenal) {
        super(arsenal);
        mainWeapon = arsenal.getWand();
        secondaryWeapon = arsenal.getPotion();
    }
}
