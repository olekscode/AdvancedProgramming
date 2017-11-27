package Assignment1.GuessGame;

public class Main {
    public static void main(String[] args) {
        GuessGame game = new GuessGame();
        game.play(10);
        game.printBestScore();
    }
}
