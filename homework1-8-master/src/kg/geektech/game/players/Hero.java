package kg.geektech.game.players;

public abstract class Hero extends GameEntity implements HavingSuperAbility {
    private SuperAbility abilityType;

    public Hero(int health, int damage, String name, SuperAbility abilityType) {
        super(health, damage, name);
        this.abilityType = abilityType;
    }

    public SuperAbility getAbilityType() {
        return abilityType;
    }

    public void attack(Boss boss) {
        if (this.getHealth() > 0 && boss.getHealth() > 0) {
            boss.setHealth(boss.getHealth() - this.getDamage());
        }
    }
}
