package Assignment1.GuessGame;

import javax.swing.*;

public class GuessGame {
    private float bestScore = 0;

    public void play(int max) {

        int number = (int)(Math.random() * (max + 1));
        int attempt = 0;

        while(attempt < 100) {
            ++attempt;

            int guess = Integer.parseInt(JOptionPane.showInputDialog("Guess the number"));

            if (guess == number) {
                System.out.println("Congratulations!");
                int score = max / attempt;

                if (score > this.bestScore) {
                    this.bestScore = score;
                }
                break;
            }
        }
    }

    public void printBestScore() {
        System.out.printf("Best score: %f\n", this.bestScore);
    }
}
