package Assignment1.HeroesGame;

public class KnightFactory extends AbstractCharacterFactory {
    @Override
    public Character createCharacter() {
        return new Knight();
    }
}