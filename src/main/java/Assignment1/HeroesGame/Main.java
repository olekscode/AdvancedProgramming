package Assignment1.HeroesGame;

public class Main {

    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();
        GameManager game = new GameManager();

        Character c1 = factory.createCharacter();
        Character c2 = factory.createCharacter();

        game.fight(c1, c2);
    }
}
