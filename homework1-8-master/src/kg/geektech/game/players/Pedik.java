package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Pedik extends Hero{
    public Pedik(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.PEDIKMAN);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        for (int i = 0; i <RPG_Game.random.nextInt(1) ; i++) {

        }
     /*int healthone = RPG_Game.random.nextInt(50)+1 ;
        boolean health1=RPG_Game.random.nextBoolean();
        boss.setHealth(boss.getHealth()-healthone);
        int healthboss;
        if (health1){
             boss.setHealth(boss.getHealth()-healthone);
            System.out.println("Boss Health: "+boss.getHealth());*/
        int healthone = RPG_Game.random.nextInt(50) + 1;
        boolean health1 = RPG_Game.random.nextBoolean();
        boss.setHealth(boss.getHealth() - healthone);
        if (health1) {
            boss.setHealth(boss.getHealth() - healthone);
            System.out.println("Boss Health: " + boss.getHealth());

            if (health1) {
                boss.setHealth(boss.getHealth() - healthone);
                int randomhealth=RPG_Game.random.nextInt(heroes.length);
                System.out.println("Boss Health: " + boss.getHealth());
                if (boss.getHealth() > 0) {
                    System.out.println(  randomhealth+ " Добавили +" + healthone);
                }
            } else {
                System.out.println("Жизнь босса не изменина:  " + boss.getHealth());
            }
        }}}