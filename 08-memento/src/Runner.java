public class Runner {

    public static void main(String[] args) {

        new Runner().run();

    }

    private void run() {

        Game game = new Game();
        Hero hero = new Hero(game);

        for(int i = 0; i < 20; i++) {
            hero.walk(10);
            hero.fight();

            System.out.println(game);
        }

        game.saveCheckPoint();
        System.out.println(game);

        hero.walk(20);
        hero.fight();

        System.out.println(game);

        hero.walk(6);
        hero.fight();

        System.out.println(game);

        hero.walk(15);
        hero.fight();

        System.out.println(game);

        game.saveCheckPoint();
        System.out.println(game);

        game.restoreCheckPoint(0);
        System.out.println(game);

        hero.walk(20);
        hero.fight();

        System.out.println(game);

        game.restoreCheckPoint(1);
        System.out.println(game);

    }

}
