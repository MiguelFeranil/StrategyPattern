public class GameApp {
    public static void main(String[] args) {
        Character knight = new Character(new KnightAttack(), new KnightDefense());
        Character wizard = new Character(new WizardAttack(), new WizardDefense());
        Character archer = new Character(new ArcherAttack(), new ArcherDefense());

        System.out.println("\nKnight:");
        knight.attack();
        knight.defend();

        System.out.println("\nWizard:");
        wizard.attack();
        wizard.defend();

        System.out.println("\nArcher:");
        archer.attack();
        archer.defend();
    }
}