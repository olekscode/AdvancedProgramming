package Assignment1.HeroesGame;

public class Elf extends Character {
    public Elf() {
        this.setPower(10);
        this.setHP(10);
    }

    @Override
    public void kick(Character c) {
        if (c.getPower() < this.getPower()) {
            c.receiveDamage(c.getHP());
        }
        else {
            c.loosePower(1);
        }
    }
}
