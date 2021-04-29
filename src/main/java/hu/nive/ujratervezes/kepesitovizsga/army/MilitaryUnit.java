package hu.nive.ujratervezes.kepesitovizsga.army;

public class MilitaryUnit {

    int health;
    int damage;
    boolean shield;

    public MilitaryUnit(int health, int damage, boolean shield) {
        this.health = health;
        this.damage = damage;
        this.shield = shield;
    }


    public int doDamage(){
        return damage;
    }

    public void sufferDamage(int damage){
        if (shield = true){
            health = health - damage/2;
        }
        else
            health = health - damage;

    }


}
