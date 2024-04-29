public abstract class Hero implements HavingSuperAbility {
    protected int health;
    protected int damage;
    protected String superabilityType;

    public Hero(int health, int damage, String superabilityType) {
        this.health = health;
        this.damage = damage;
        this.superabilityType = superabilityType;
    }
}