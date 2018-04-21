package warriors;

import armies.Arsenal;

public class NorthKnight extends Warrior {

    public NorthKnight(Arsenal arsenal) {
        super(arsenal);
        mainWeapon = arsenal.getSword();
        secondaryWeapon = arsenal.getDagger();
    }

}
