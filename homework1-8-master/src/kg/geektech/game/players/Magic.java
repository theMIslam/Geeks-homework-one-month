package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Magic extends Hero {
    public Magic(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        int boost = RPG_Game.random.nextInt(6) + 5; //5,6,7,8,9,10
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getDamage() > 0) {
                heroes[i].setDamage(heroes[i].getDamage() + boost);

            }
        }
    }
}
