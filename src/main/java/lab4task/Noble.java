package lab4task;

import java.util.Random;
import lab4task.strategy.NobleStrategy;

public class Noble extends Character {
    public static final Random RANDOM = new Random();
    public Noble(int minPower, int maxPower, int minHp, int maxHp){
        super(RANDOM.nextInt(maxPower - minPower) + minPower, RANDOM.nextInt(maxHp - minHp) + minHp, new NobleStrategy());

    }
    @Override
    public void setHp(int hp) {
        if (hp < 0) {
            hp = 0;
        }
        super.setHp(hp);
    }
}
