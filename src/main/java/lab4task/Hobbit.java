package lab4task;

import lab4task.strategy.HobbitKickStrategy;

public class Hobbit extends Character{
    public Hobbit(){
        super(3, 0, new HobbitKickStrategy());
    }
    @Override
    public String toString() {
        return "Hobbit{hp=" + getHp() + ", power=" + getPower() + "}";
}

    @Override
        public void setHp(int hp) {
            if (hp < 0) {
                hp = 0;
            }
            super.setHp(hp);
        }
}
