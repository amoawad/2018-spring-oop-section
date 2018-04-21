package armies;

import weapons.Weapon;

// abstract factory
public abstract class Arsenal {

    public abstract Weapon getSword();
    public abstract Weapon getDagger();

    public abstract Weapon getWand();
    public abstract Weapon getPotion();

}
