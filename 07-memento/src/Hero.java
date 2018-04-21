import java.util.Random;

public class Hero {

    Game game;

    public Hero(Game game) {
        this.game = game;
    }

    public void walk(int steps) {
        game.moveHero(steps);
    }

    public void fight() {
        Random random = new Random();
        int hits = random.nextInt(20);

        game.killCreeps(hits);
    }

}
