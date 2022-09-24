package kg.geektech.game.players;

public class Magic extends Hero {
    int boostPoint;


    public Magic(int health, int damage, String name) {

        super(health, damage, name, SuperAbility.BOOST);

this.boostPoint = 1;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i <heroes.length ; i++) {
            heroes[i].setDamage(heroes[i].getDamage() + boostPoint);
        }
        System.out.println(this.getName()+" boosted every-hero's damage for "+boostPoint+" units!");


        }
 }


