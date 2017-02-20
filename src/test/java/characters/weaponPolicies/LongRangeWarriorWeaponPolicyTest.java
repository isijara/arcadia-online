package characters.weaponPolicies;

import characters.Archer;
import characters.GameCharacter;
import characters.Wizard;
import items.weapons.LongRangeWeapon;
import items.weapons.MagicWeapon;
import items.weapons.MeleeWeapon;
import items.weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

public class LongRangeWarriorWeaponPolicyTest{

    private GameCharacter archer;

    private Weapon longRangeWeapon = new LongRangeWeapon("Composite bow", 500);
    private Weapon meleeWeapon = new MeleeWeapon("Master Sword", 500);
    private Weapon magicalWeapon = new MagicWeapon();


    @Before
    public void setUp() {
        this.archer = new Archer();
    }

    @Test(expected = Exception.class)
    public void validateMagicianWeaponLongRangeTest() throws Exception {
        this.archer.setMainWeapon(this.magicalWeapon);
    }

    @Test(expected = Exception.class)
    public void validateMeleeWeaponLongRangeTest() throws Exception {
        this.archer.setMainWeapon(this.meleeWeapon);
    }

    @Test
    public void validateWeaponTest() throws Exception {
        this.archer.setMainWeapon(this.longRangeWeapon);
    }
}
