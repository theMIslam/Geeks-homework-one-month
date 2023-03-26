package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Thor extends Hero{
    public Thor(int health, int damage, String name) {
        super(health, damage, name,SuperAbility.TUNDECLUP);
    }


    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
      boolean thorHamer=RPG_Game.random.nextBoolean();
        if (thorHamer){
boss.setDamage(0);
            System.out.println("Boss oglushon");
        }else{
            boss.setDamage(50);
        }
    }
}
