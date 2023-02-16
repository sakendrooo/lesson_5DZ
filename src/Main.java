public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossHealts(100);
        boss.setBossDamage(50);
        boss.setTypeOfDefence("Armor");
        System.out.println("Boss health: " + boss.getBossHealts());
        System.out.println("Boss damage: " + boss.getBossDamage());
        System.out.println("Boss defense type: " + boss.getBossHealts());

    }
}