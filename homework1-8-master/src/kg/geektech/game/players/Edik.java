package kg.geektech.game.players;

public class Edik extends Hero {
    public int getSave() {
        return save;
    }

    public void setSave(int save) {
        this.save = save;
    }

    private  int save ;


    public Edik(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.DEAT);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
if (this.getHealth() > 0){
    for (int i = 0; i <heroes.length ; i++) {
        if (heroes[i].getHealth() == 0 && this !=heroes[i]){
            heroes[i].setHealth(heroes[i].getHealth()+ this.getHealth() );
            break;
        }
    }
}
    }
}
