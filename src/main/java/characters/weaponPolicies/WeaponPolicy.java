package characters.weaponPolicies;

import items.weapons.Weapon;

public interface WeaponPolicy {
    public boolean validateWeapon(Weapon weapon) throws Exception;
}
