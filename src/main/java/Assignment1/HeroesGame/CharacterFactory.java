package Assignment1.HeroesGame;

public class CharacterFactory extends AbstractCharacterFactory {
    private AbstractCharacterFactory[] factories;

    CharacterFactory() {
        factories = new AbstractCharacterFactory[] {
                new HobbitFactory(),
                new ElfFactory(),
                new KingFactory(),
                new KnightFactory()
        };
    }

    @Override
    public Character createCharacter() {
        int i = (int)(Math.random() * factories.length);
        return factories[i].createCharacter();
    }
}
