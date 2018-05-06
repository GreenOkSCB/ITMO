package lesson6.battle;

public class Red extends Soldier{

    public Red() {
        super(200, 100);
    }

    @Override
    public void attack(Soldier enemy) {
        enemy.health -= this.attackScore + 10;
    }
}