public class Main {
    public static void main(String[] args) {
        Hero[] heroes = new Hero[3];
        heroes[0] = new Medic(150, 25, "Healing", 15);
        heroes[1] = new Magic(200, 25);
        heroes[2] = new Warrior(200, 20, "Critical Damage");

        for (Hero hero : heroes) {
            hero.applySuperAbility();
            if (hero instanceof Medic) {
                ((Medic) hero).increaseExperience();
            }

        }
    }

}