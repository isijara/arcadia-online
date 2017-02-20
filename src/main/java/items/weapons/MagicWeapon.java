package items.weapons;


public class MagicWeapon extends Weapon {

    private double attackModifier = 1;
    private double attack = 50;
    private String name;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getAttack() {
        return this.attack;
    }

    @Override
    public double getAttackModifier() {
        return this.attackModifier;
    }
}
