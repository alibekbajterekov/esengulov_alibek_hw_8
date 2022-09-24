package kg.geektech.game.players;


public class Witcher extends Hero {
    public Witcher(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.WITCHER);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (this.getDamage() > 0){
            this.setDamage(0);
        }
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() <= 0){
                heroes[i].setHealth(heroes[i].getHealth() + this.getHealth());
                this.setHealth(0);
            }
            break;
        }

    }
}