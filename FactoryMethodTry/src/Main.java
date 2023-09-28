interface CharacterFactory{
    void fight();
}

class Wizard implements CharacterFactory{
    @Override
    public void fight() {
        System.out.println("I´m Harry Potter");;
    }
}

class Warrior implements CharacterFactory{
    @Override
    public void fight() {
        System.out.println("I´m Achilles");;
    }
}

abstract class CharacterCreator{
    public abstract CharacterFactory createCharacter();
}

class WizardCreator extends CharacterCreator{
    @Override
    public CharacterFactory createCharacter() {
        return new Wizard();
    }
}

class WarriorCreator extends CharacterCreator{
    @Override
    public CharacterFactory createCharacter() {
        return new Warrior();
    }
}

public class Main{
    public static void main(String[] args) {
        CharacterCreator creator = new WizardCreator();
        CharacterFactory character = creator.createCharacter();
        character.fight();

        CharacterCreator creator2 = new WarriorCreator();
        CharacterFactory character2 = creator2.createCharacter();
        character2.fight();
    }
}