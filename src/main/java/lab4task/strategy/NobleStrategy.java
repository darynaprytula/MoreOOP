package lab4task.strategy;
import java.util.Random;
import lab4task.Character;

public class NobleStrategy extends KickStrategy {
    public static final Random RANDOM = new Random();
    @Override
    public void kick(Character character, Character enemy){
        int enemyHp = enemy.getHp();
        enemy.setHp(enemyHp - RANDOM.nextInt(character.getPower()));
    }
    
}
