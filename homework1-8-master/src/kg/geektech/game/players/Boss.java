package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Boss extends GameEntity {
    private SuperAbility defenceType;

    public Boss(int health, int damage, String name) {
        super(health, damage, name);
    }

    public SuperAbility getDefenceType() {
        return defenceType;
    }

    public void chooseDefence(Hero[] heroes) {
        int randomIndex = RPG_Game.random.nextInt(heroes.length);
        this.defenceType = heroes[randomIndex].getAbilityType();
    }

    @Override
    public String toString() {
        /*if (this.defenceType == null) {
            return "BOSS " + super.toString() + " defence: " ;
        } else {
            return "BOSS " + super.toString() + " defence: " + this.defenceType;
        }*/
        return "BOSS " + super.toString() + " defence: " +
                (this.defenceType == null ? "" : this.defenceType);
    }

    public void attack(Hero[] heroes) {


        if (this.getHealth() > 0) {
            for (int i = 0; i < heroes.length; i++) {
                if (heroes[i].getHealth() > 0) {
                    if (heroes[i] instanceof Berserk) {
                        heroes[i].setHealth(heroes[i].getHealth()
                                - this.getDamage() / 2);
                        ((Berserk) heroes[i]).setSavedDamage(this.getDamage() / 2);
                    } else {
                        heroes[i].setHealth(heroes[i].getHealth()
                                - this.getDamage());
                    }
                }
                if (heroes[i].getHealth() > 0) {
                    heroes[i].setHealth(heroes[i].getHealth() - this.getDamage());
                }
            }
        }
    }
}