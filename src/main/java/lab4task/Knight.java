package lab4task;

import java.util.Random;

public class Knight extends Noble {
    public static final Random RANDOM = new Random();
    public Knight(){
        super(2, 12, 2, 12);
    }

    @Override
    public String toString() {
        return "Knight{hp=" + getHp() + ", power=" + getPower() + "}";
}
}

