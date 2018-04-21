package armies;

import warriors.NorthKnight;
import warriors.NorthMagician;
import warriors.Warrior;

public class NorthArmy extends Army {

    public NorthArmy() {
        arsenal = new NorthArsenal();
    }

    @Override
    protected Warrior selectWarrior(String type)  {
        Warrior warrior = null;

        if(type == "knight") {
            warrior = new NorthKnight(arsenal);
        } else if(type == "magician") {
            warrior = new NorthMagician(arsenal);
        }

        return warrior;
    }
}
