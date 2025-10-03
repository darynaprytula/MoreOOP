package lab4task.strategy;
import lab4task.Character;
public class ElfKickStrategy extends KickStrategy{
    @Override
    public void kick(Character main, Character character){
        if (character.getPower() < main.getPower()){
            character.setHp(0);
        }else{
            character.setHp(character.getHp() - 1);
        }
    }
}
