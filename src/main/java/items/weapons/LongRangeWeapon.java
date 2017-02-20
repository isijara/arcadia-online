package items.weapons;

import items.Item;

public class LongRangeWeapon extends Weapon implements Item {

    public double getAttack() {
        return this.attack;
    }

    public LongRangeWeapon(String name, double attack) {
        super(name, attack, WeaponAttackModifier.LONG_RANGE);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getAttackModifier() {
        return this.attackModifier;
    }

}
