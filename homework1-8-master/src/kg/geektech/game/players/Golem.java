package kg.geektech.game.players;

public class Golem extends Hero {
    private int defender;

    public int getDefender() {
        return defender;
    }

    public void setDefender(int defender) {
        this.defender = defender;
    }

    public Golem(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.STONE_LIFE);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        for (int i = 0; i < heroes.length; i++) {
            if (boss.getHealth() == 0 && heroes[i].getHealth() > 0 && this != heroes[i]) {
              defender = boss.getDamage()/1;
              heroes[i].setHealth(heroes[i].getHealth()-this.defender);
              heroes[i].setHealth(heroes[i].getHealth()-this.defender);
            }else {
                defender = boss.getDamage() / 5 ;
                heroes[i].setHealth(heroes[i].getHealth()-this.defender);
            }
        }
    }
/*
        for (int i = 0; i < heroes.length; i++) {
        if (heroes[7].getHealth()>0  && heroes[i].getHealth()>0 && heroes[7].getHealth() !=heroes[i].getHealth()){
*/


    // for (int i = 0; i < heroes.length; i++) {
    //if (this.getHealth() > 0 && this != heroes[i] && boss.getHealth() > 0) {
    //      heroes[i].setHealth(heroes[i].getHealth() - (boss.getDamage() - 10));
    //    setDefender(boss.getDamage() / 5);
    //  heroes[i].setHealth(heroes[i].getHealth() - (heroes.length * getDefender()));
    //}
    //}}
}
