public class medic extends Hero{

    public medic(int health, int damage, String superpower) {
        super(health, damage, superpower);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Медик вахуи от мага");

    }
}
