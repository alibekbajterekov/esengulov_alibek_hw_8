package kg.geektech.game.players;

public class Golem extends Hero {
    public Golem(int health, int damage, String name) {

        super(health, damage, name, SuperAbility.GOLEM);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boss.setDamage(boss.getDamage() - boss.getDamage() / 5);

    }
}