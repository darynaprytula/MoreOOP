package lab4task;
public class Main {
    public static void main(String[] args) {
        Character character1 = CharacterFactory.createRandomCharacter();
        Character character2 = CharacterFactory.createRandomCharacter();
        GameManager.fight(character1, character2);

    }
    
}
