package lab4task;

import lab4task.strategy.ElfKickStrategy;

public class Elf extends Character{
    public Elf(){
        super(10, 10, new ElfKickStrategy());
    }

        @Override
    public String toString() {
        return "Elf{hp=" + getHp() + ", power=" + getPower() + "}";
}

    @Override
        public void setHp(int hp) {
            if (hp < 0) {
                hp = 0;
            }
            super.setHp(hp);
        }
}
