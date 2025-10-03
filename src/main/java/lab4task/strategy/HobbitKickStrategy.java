package lab4task.strategy;

public class HobbitKickStrategy extends KickStrategy {
    @Override
    public void kick(lab4task.Character main, lab4task.Character character){
        System.out.println("Hobbit cries a lot!");
    }
}
