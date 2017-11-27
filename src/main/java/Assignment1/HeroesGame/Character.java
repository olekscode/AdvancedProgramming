package Assignment1.HeroesGame;

public abstract class Character {
    private int power;
    private int hp;
    private int maxHp;

    public abstract void kick(Character c);

    public boolean isAlive() {
        return hp > 0;
    }

    public boolean isDead() {
        return !isAlive();
    }

    public int getPower() {
        return this.power;
    }

    public int getHP() {
        return this.hp;
    }

    public int getMaxHP() {
        return this.maxHp;
    }

    protected void setPower(int power) {
        this.power = power;
    }

    protected void setHP(int hp) {
        this.hp = hp;
        this.maxHp = hp;
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }

    public void receiveDamage(int damage) {
        this.hp -= Math.min(this.hp, damage);
    }

    public void loosePower(int powerPoints) {
        if (this.power > 0) {
            this.power -= powerPoints;
        }
    }
}
