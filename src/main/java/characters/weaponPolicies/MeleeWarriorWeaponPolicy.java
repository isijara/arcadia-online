package characters.weaponPolicies;

import items.weapons.LongRangeWeapon;
import items.weapons.MagicWeapon;
import items.weapons.Weapon;


public class MeleeWarriorWeaponPolicy implements WeaponPolicy {

    public boolean validateWeapon(Weapon weapon) throws Exception {
        if(weapon instanceof LongRangeWeapon || weapon instanceof MagicWeapon)
            throw new Exception("Melee characters can not use Long Range or Magical Weapons");

        return true;
    }
}
