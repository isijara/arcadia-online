package items.weapons;


public class Weaponless extends Weapon {

    private String name = "Weaponless";

    public Weaponless() {
        super();
    }

    public Weaponless(String name, double attack) {
        super(name, 0, WeaponAttackModifier.NONE);
    }

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
