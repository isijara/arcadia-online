package characters.weaponPolicies;

import characters.GameCharacter;
import characters.Knight;
import characters.Wizard;
import items.weapons.LongRangeWeapon;
import items.weapons.MagicWeapon;
import items.weapons.MeleeWeapon;
import items.weapons.Weapon;
import org.junit.Before;
import org.junit.Test;


public class MagicWarriorWeaponPolicyTest  {

    private GameCharacter magician;

    private Weapon longRangeWeapon = new LongRangeWeapon("Composite bow", 500);
    private Weapon meleeWeapon = new MeleeWeapon("Master Sword", 500);
    private Weapon magicalWeapon = new MagicWeapon();


    @Before
    public void setUp() {
        this.magician = new Wizard();
    }

    @Test(expected = Exception.class)
    public void validateMagicianWeaponLongRangeTest() throws Exception {
        this.magician.setMainWeapon(longRangeWeapon);
    }

    @Test(expected = Exception.class)
    public void validateMeleeWeaponLongRangeTest() throws Exception {
        this.magician.setMainWeapon(this.meleeWeapon);
    }

    @Test
    public void validateWeaponTest() throws Exception {
        this.magician.setMainWeapon(this.magicalWeapon);
    }
}
