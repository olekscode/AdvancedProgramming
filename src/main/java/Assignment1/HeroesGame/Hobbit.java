package Assignment1.HeroesGame;

public class Hobbit extends Character {
    public Hobbit() {
        this.setPower(0);
        this.setHP(3);
    }

    @Override
    public void kick(Character c) {
        this.toCry();
    }

    private void toCry() {
//        System.out.println("Hobbit is crying");
    }
}
