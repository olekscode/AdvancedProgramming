package Assignment1.HeroesGame;

public class GameManager {
    private GamePrinter printer = new GamePrinter();

    public void fight(Character c1, Character c2) {
        int round;

        for (round = 1; round <= 30; ++round) {
            printer.printRoundHeader(round);
            printer.printStatusBars(c1, c2);

            c1.kick(c2);
            printer.printKick(c1, c2);

            if (c2.isAlive()) {
                c2.kick(c1);
                printer.printKick(c2, c1);
            }
            else {
                printer.pronounceDead(c2);
                printer.announceWinner(c1);
                break;
            }
            if (c1.isDead()) {
                printer.pronounceDead(c1);
                printer.announceWinner(c2);
                break;
            }
        }
        if (round > 30) {

        }
    }
}
