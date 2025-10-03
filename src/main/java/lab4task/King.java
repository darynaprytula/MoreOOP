package lab4task;
import java.util.Random;

public class King extends Noble {
    public static final Random RANDOM = new Random();
    public King(){
        super(5, 15, 5, 15);
    }

    @Override
    public String toString() {
        return "King{hp=" + getHp() + ", power=" + getPower() + "}";
}
}
