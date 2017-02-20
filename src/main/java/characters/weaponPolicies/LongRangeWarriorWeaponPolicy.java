package characters.weaponPolicies;

import items.weapons.MagicWeapon;
import items.weapons.MeleeWeapon;
import items.weapons.Weapon;

public class LongRangeWarriorWeaponPolicy implements WeaponPolicy {
    @Override
    public boolean validateWeapon(Weapon weapon) throws Exception {
        if( weapon instanceof MagicWeapon || weapon instanceof MeleeWeapon)
            throw new Exception("Long range warriors can not use magical or melee weapons");

        return true;
    }
}
