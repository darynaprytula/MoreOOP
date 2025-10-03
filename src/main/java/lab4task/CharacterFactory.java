package lab4task;

import java.util.Random;

public class CharacterFactory {
    public static final Random RANDOM = new Random();

    public static Character createRandomCharacter(){
        int choice = RANDOM.nextInt(3);
        switch ((choice)) {
            case 0:
                return new Hobbit();
            case 1:
                return new Elf();
            case 2:
                return new Knight();
            case 3:
                return new King();
        
        }
        return null;
    }
}
