package Assignment1.HeroesGame;

public class GamePrinter {

    public void printRoundHeader(int round) {
        System.out.printf("\n__________ Round %d __________\n\n", round);
    }

    public void printStatusBars(Character c1, Character c2) {
        System.out.printf("%s\n%s\n\n", status(c1), status(c2));
    }

    public void pronounceDead(Character c) {
        System.out.printf("\t%s has died\n", c.getType());
    }

    public void announceWinner(Character c) {
        System.out.printf("\t%s has won!\n", c.getType());
    }

    public void printKick(Character kicker, Character kicked) {
        System.out.printf("\t%s kicked %s\n", kicker.getType(), kicked.getType());
    }

    private String status(Character c) {
        String hpBar = String.format(
                "%0" + c.getHP() + "d", 0)
                .replace("0", "=");

        String status = String.format(
                "%6s | Power: %2d | HP: [%" + c.getMaxHP() + "s]",
                c.getType(),
                c.getPower(),
                hpBar);

        return status;
    }
}
