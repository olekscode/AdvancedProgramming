package Assignment1.HeroesGame;

public abstract class Human extends Character {
    public Human(int minPowerHP, int maxPowerHP) {
        int power = randomInteger(minPowerHP, maxPowerHP);
        int hp = randomInteger(minPowerHP, maxPowerHP);

        this.setPower(power);
        this.setHP(hp);
    }

    @Override
    public void kick(Character c) {
        int damage = randomInteger(0, this.getPower());
        c.receiveDamage(damage);
    }

    private int randomInteger(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }
}
