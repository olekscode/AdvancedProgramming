package Assignment1.NeverUseSwitch;

import Assignment1.HeroesGame.Character;

public class Main {
    public static void main(String[] args) {
        CharacterFactorySwitch switchFactory = new CharacterFactorySwitch();
        CharacterFactoryPolymorphism polymorhismFactory = new CharacterFactoryPolymorphism();

        System.out.println("Characters created using switch:");

        for (int i = 0; i < 10; ++i) {
            Character character = switchFactory.createCharacter();
            System.out.println(character.getType());
        }

        System.out.println();
        System.out.println("Characters created using polymorphism:");

        for (int i = 0; i < 10; ++i) {
            Character character = polymorhismFactory.createCharacter();
            System.out.println(character.getType());
        }
    }
}
