public class Hero {
    private int Health;
    private int Damage;
    private int superFarting;

    public Hero(int health, int damage) {
        Health = health;
        Damage = damage;
    }

    public int getHealth() {
        return Health;
    }

    public int getDamage() {
        return Damage;
    }

    public int getSuperFarting() {
        return superFarting;
    }

    public Hero(int health, int damage, int superFarting) {
        Health = health;
        Damage = damage;
        this.superFarting = superFarting;

    }
}
