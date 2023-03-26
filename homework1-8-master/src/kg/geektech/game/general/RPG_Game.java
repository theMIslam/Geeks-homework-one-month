package kg.geektech.game.general;

import kg.geektech.game.players.*;

import java.util.Random;

public class RPG_Game {
    public static Random random = new Random();
    private static int round_number;

    public static void startGame() {
        Boss boss = new Boss(1000, 50, "Boke");
        Warrior warrior = new Warrior(270, 10, "Albert");
        Medic doc = new Medic(250, 0, "Aibolit", 15);
        Magic magic = new Magic(260, 15, "Gendelf");
        Berserk berserk = new Berserk(280, 20, "Ahiles");
        Medic assistant = new Medic(290, 5, "Strange", 5);
        Thor thor=new Thor(270,22,"Oden");
        Golem golem=new Golem(400,3,"Golem");
        Hacker hacker=new Hacker(270,14,"Snoyden");
        Alukard alukard=new Alukard(290,33,"Alukar");
        Hero[] heroes = {warrior, doc, magic, berserk, assistant,thor,golem,hacker};
        Hero[] heroes1={};

        printStatistics(heroes, boss);
        while (!isGameFinished(heroes, boss)) {
            playRound(heroes, boss);
        }
    }

    private static void playRound(Hero[] heroes, Boss boss) {
        round_number++;
        boss.chooseDefence(heroes);
        boss.attack(heroes);
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getAbilityType() != boss.getDefenceType()
                    && boss.getHealth() > 0 && heroes[i].getHealth() > 0) {
                heroes[i].attack(boss);
                heroes[i].applySuperPower(heroes, boss);
            }
        }
        printStatistics(heroes, boss);
    }

    private static void printStatistics(Hero[] heroes, Boss boss) {
        System.out.println("ROUND " + round_number + " ----------");
        System.out.println(boss);
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i]);
        }
    }

    private static boolean isGameFinished(Hero[] heroes, Boss boss) {
        if (boss.getHealth() <= 0) {
            System.out.println("Heroes won!!!");
            return true;
        }
        boolean allHeroesDead = true;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                allHeroesDead = false;
                break;
            }
        }
        if (allHeroesDead) {
            System.out.println("Boss won!!!");
        }
        return allHeroesDead;
    }
}
