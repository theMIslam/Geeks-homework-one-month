public abstract class Hero implements HavingSuperAbility {
        private int health;
        private int  damage;


        private String  superpower;


    public Hero(int health, int damage, String superpower) {
        this.health = health;
        this.damage = damage;
        this.superpower = superpower;
    }
}
