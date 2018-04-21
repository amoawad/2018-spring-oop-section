package warriors;

import armies.Arsenal;

public class SouthKnight extends Warrior {

    public SouthKnight(Arsenal arsenal) {
        super(arsenal);

        mainWeapon = arsenal.getSword();
        secondaryWeapon = arsenal.getDagger();
    }
}
