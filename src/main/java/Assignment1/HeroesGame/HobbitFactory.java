package Assignment1.HeroesGame;

public class HobbitFactory extends AbstractCharacterFactory {
    @Override
    public Character createCharacter() {
        return new Hobbit();
    }
}
