package items.equipment;

import items.weapons.Weapon;

/**
 * Created by Link on 20/02/17.
 */
public abstract class WeaponDecorator extends Weapon {

    public abstract double getAttack();

    public abstract double getAttackModifier();

    public abstract String getName();
}
