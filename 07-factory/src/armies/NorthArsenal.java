package armies;

import weapons.*;

public class NorthArsenal extends Arsenal {
    @Override
    public Weapon getSword() {
        return new ClaymoreSword();
    }

    @Override
    public Weapon getDagger() {
        return new PersianDagger();
    }

    @Override
    public Weapon getWand() {
        return new WhiteMagicWand();
    }

    @Override
    public Weapon getPotion() {
        return new ManaPotion();
    }
}
