package armies;

import weapons.*;

public class SouthArsenal extends Arsenal {
    @Override
    public Weapon getSword() {
        return new IndianSword();
    }

    @Override
    public Weapon getDagger() {
        return new AncientDagger();
    }

    @Override
    public Weapon getWand() {
        return new BlackMagicWand();
    }

    @Override
    public Weapon getPotion() {
        return new HealthPotion();
    }
}
