package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Warrior extends Hero {
    public Warrior(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        int coeff = RPG_Game.random.nextInt(3) + 2;
        boss.setHealth(boss.getHealth() - this.getDamage() * coeff);
        System.out.println("Critical damage: " + this.getDamage() * coeff);
    }
}
