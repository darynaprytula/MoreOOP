package lab4task;

import lab4task.strategy.KickStrategy;
import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public abstract class Character {
    private int hp;
    private int power;
    private KickStrategy KickStrategy;

    public boolean isAlive(){
        return hp > 0;
    }
    
    public void kick(Character character){
        KickStrategy.kick(this, character);
    }
}
