package lesson6.battle;

abstract class Soldier{
    int health;
    int attackScore;


    public Soldier(int health, int attackScore){
        this.health = health;
        this.attackScore = attackScore;
    }

    public boolean isAllive(){
        return health > 0;
    }

    abstract void attack(Soldier enemy);
}



