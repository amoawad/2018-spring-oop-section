import java.util.ArrayList;

public class Game {

    GameMemento currentState;

    ArrayList<GameMemento> history;

    public Game() {
        currentState = new GameMemento(1, 100, 0);
        history = new ArrayList<>();
    }

    public void moveHero(int steps) {
        currentState.setHeroPosition(currentState.getHeroPosition() + steps);
    }

    public void killCreeps(int hits) {
        currentState.setCreeps(currentState.getCreeps() - hits);

        if(currentState.getCreeps() <= 0) {
            levelUp();
        }
    }

    private void levelUp() {
        currentState.setLevel(currentState.getLevel()+1);
        currentState.setCreeps(100);
        currentState.setHeroPosition(0);
    }

    public void saveCheckPoint() {
        System.out.println("------ Save");
        this.history.add(new GameMemento(currentState.getLevel(), currentState.getCreeps(), currentState.getHeroPosition()));
    }

    public void restoreCheckPoint(int index) {
        System.out.println("------ Restore");
        GameMemento checkpoint = history.get(index);
        this.currentState = new GameMemento(checkpoint.getLevel(), checkpoint.getCreeps(), checkpoint.getHeroPosition());
    }

    @Override
    public String toString() {
        return currentState.toString();
    }
}
