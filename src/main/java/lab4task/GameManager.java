package lab4task;

public class GameManager {
    public static void fight(Character character1, Character character2){
        System.out.println("GAME STARTED!");
        while (character1.isAlive() && character2.isAlive()){
        int current_hp1 = character1.getHp();
        int current_hp2 = character2.getHp();
        character1.kick(character2);
        character2.kick(character1);
        if (character1.getClass().getSimpleName().equals("Hobbit") && character2.getClass().getSimpleName().equals("Hobbit")){
            break;
        }
        if (current_hp1 == character1.getHp() && current_hp2 != character2.getHp()){
            System.out.println(character1.getClass().getSimpleName() + "`s hp wasn't changed"  + " and "  + character2.getClass().getSimpleName() + "`s hp was reduced from " + current_hp2 + " to " + character2.getHp());
        } else if  (current_hp1 != character1.getHp() && current_hp2 == character2.getHp()){
            System.out.println(character1.getClass().getSimpleName() + "`s hp was reduced from " + current_hp1 + " to " + character1.getHp() + " and "  + character2.getClass().getSimpleName() + "`s hp wasn't changed ");
        }else{
        System.out.println(character1.getClass().getSimpleName() + "`s hp was reduced from " + current_hp1 + " to " + character1.getHp() + " and "  + character2.getClass().getSimpleName() + "`s hp was reduced from " + current_hp2 + " to " + character2.getHp());
        }
    }
        System.out.println("GAME OVER!");
    }
        
    }
