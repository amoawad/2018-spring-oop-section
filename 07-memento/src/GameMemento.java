public class GameMemento {

    private int level;
    private int creeps;
    private int heroPosition;

    public GameMemento(int level, int creeps, int heroPosition) {
        this.level = level;
        this.creeps = creeps;
        this.heroPosition = heroPosition;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setCreeps(int creeps) {
        this.creeps = creeps;
    }

    public void setHeroPosition(int heroPosition) {
        this.heroPosition = heroPosition;
    }

    public int getLevel() {
        return level;
    }

    public int getCreeps() {
        return creeps;
    }

    public int getHeroPosition() {
        return heroPosition;
    }

    @Override
    public String toString() {
        return "Level: " + level + ", Creeps: " + creeps + ", Position: " + heroPosition;
    }

}
