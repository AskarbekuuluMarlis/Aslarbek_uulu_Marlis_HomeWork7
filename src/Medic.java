public class Medic extends Hero {
    private int healPoint;

    public Medic(int hp, int damage, String abilityType, int healPoint) {
        super(hp, damage, abilityType);
        this.healPoint = healPoint;
    }

    public void increaseExperience() {
        healPoint *= 1.1;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Mediс использовал " + superabilityType);

    }


}