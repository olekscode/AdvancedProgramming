package Assignment1.HeroesGame;

public class KingFactory extends AbstractCharacterFactory {
    @Override
    public Character createCharacter() {
        return new King();
    }
}
