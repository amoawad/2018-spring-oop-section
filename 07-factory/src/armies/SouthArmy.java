package armies;

import warriors.SouthKnight;
import warriors.SouthMagician;
import warriors.Warrior;

public class SouthArmy extends Army {

    public SouthArmy() {
        arsenal = new SouthArsenal();
    }

    @Override
    protected Warrior selectWarrior(String type)  {
        Warrior warrior = null;

        if(type == "knight") {
            warrior = new SouthKnight(arsenal);
        } else if(type == "magician") {
            warrior = new SouthMagician(arsenal);
        }

        return warrior;
    }
}
