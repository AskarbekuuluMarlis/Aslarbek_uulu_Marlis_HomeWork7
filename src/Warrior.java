public class Warrior extends Hero {

    public Warrior(int health, int damage, String superabilityType) {
        super(health, damage, superabilityType);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Warrior использовал " + superabilityType);
    }
}