package Assignment1.HeroesGame;

public class ElfFactory extends AbstractCharacterFactory {
    @Override
    public Character createCharacter() {
        return new Elf();
    }
}
