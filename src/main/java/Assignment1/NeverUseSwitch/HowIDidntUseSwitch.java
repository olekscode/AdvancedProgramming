package Assignment1.NeverUseSwitch;

import Assignment1.HeroesGame.*;
import Assignment1.HeroesGame.Character;

/*
One way of eliminating switch statements in object-oriented code
is polymorphism. Instead of writing a long list of switch cases
with different ways to perform some operation, we create many
different types of objects, with each one of them implementing
that operation in it's own way.

A good example of when I used polymorphism instead of switch
was in a HeroesGame. I needed to create Character factory
with one method createCharacter() that would randomly create
a character of one of the following types: Elf, Hobbit, Human,
King, Knight.

The first solution that comes to mind is the "ugly" one
 */

class CharacterFactorySwitch {
    private AbstractCharacterFactory[] factories;

    CharacterFactorySwitch() {
        factories = new AbstractCharacterFactory[] {
                new HobbitFactory(),
                new ElfFactory(),
                new KingFactory(),
                new KnightFactory()
        };
    }

    public Character createCharacter() {
        int i = (int)(Math.random() * factories.length);
        return factories[i].createCharacter();
    }
}

/*
Now here is my better solution. I create AbstractCharacterFactory -
an abstract superclass for all CharacterFactories with an abstract
method createCharacter. Every specific character factory provides
its own implementation of this method. For example
 */

class HobbitFactory extends AbstractCharacterFactory {
    @Override
    public Character createCharacter() {
        return new Hobbit();
    }
}

/*
Now I create CharacterFactoryPolymorhism (a better name for this
class would be RandomCharacterFactory) which is also a subclass
of AbstractCharacterFactory. It has an array of concrete factories
and implements createCharacter method in such way that every time
it selects a random factory from the array and asks it to create
a character.
 */


class CharacterFactoryPolymorphism extends AbstractCharacterFactory {
    private AbstractCharacterFactory[] factories;

    CharacterFactoryPolymorphism() {
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
