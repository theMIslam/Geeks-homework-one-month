public class magic extends Hero{

    public magic(int health, int damage, String superpower) {
        super(health, damage, superpower);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Маг обоссал медика");

    }
}

