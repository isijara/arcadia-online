package items.equipment;

import items.weapons.Weapon;


public abstract class WeaponDecorator extends Weapon {

    public abstract double getAttack();

    public abstract double getAttackModifier();

    public abstract String getName();
}
