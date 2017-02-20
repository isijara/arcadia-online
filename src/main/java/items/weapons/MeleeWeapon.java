package items.weapons;


public class MeleeWeapon extends Weapon {

    public MeleeWeapon(String name, double attack) {
        super(name, attack, WeaponAttackModifier.MELEE);
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
