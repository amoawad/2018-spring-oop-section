package armies;

import warriors.Warrior;

public abstract class Army {

    protected Arsenal arsenal;

    public Warrior createWarrior(String type) {
        Warrior warrior = selectWarrior(type);
        
        warrior.putArmor();
        warrior.holdMainWeapon();
        warrior.holdSecondaryWeapon();
        warrior.march();

        return warrior;
    }

    // factory method
    protected abstract Warrior selectWarrior(String type);

}
