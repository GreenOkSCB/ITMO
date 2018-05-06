package lesson6.battle;

public class White extends Soldier {

    public White() {
        super(10, 50);
    }

    @Override
    public void attack(Soldier enemy){
        enemy.health -= this.attackScore + 20;
    }
}