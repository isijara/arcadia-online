package characters.weaponPolicies;

import items.weapons.LongRangeWeapon;
import items.weapons.MeleeWeapon;
import items.weapons.Weapon;


public class MagicWarriorWeaponPolicy implements WeaponPolicy {
    @Override
    public boolean validateWeapon(Weapon weapon) throws Exception {
        if(weapon instanceof LongRangeWeapon || weapon instanceof MeleeWeapon)
            throw new Exception("Magical characters can not use Long Range or Melee Weapons ");

        return true;
    }
}
