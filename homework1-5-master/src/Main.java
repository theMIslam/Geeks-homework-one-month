public class Main {
    public static void main(String[] args) {
Boss Tanos = new Boss();
Tanos.setDamage(80);
        System.out.println(Tanos.getDamage());
        Tanos.setHealth(700);
        System.out.println(Tanos.getHealth());
        Tanos.setBossDefenceType("Physics");
        System.out.println(Tanos.getBossDefenceType());
        Hero Hanma = new Hero(250, 60, 120);
        Hero Baki = new Hero (260, 65,0);
Hero Jack = new Hero(240,55);

    }
}