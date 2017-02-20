package characters.weaponPolicies;

import characters.Archer;
import characters.GameCharacter;
import characters.Knight;
import items.weapons.LongRangeWeapon;
import items.weapons.MagicWeapon;
import items.weapons.MeleeWeapon;
import items.weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by proyectos on 13/05/16.
 */
public class MeleeWarriorWeaponPolicyTest {

    private GameCharacter melee;

    private Weapon longRangeWeapon = new LongRangeWeapon("Composite bow", 500);
    private Weapon meleeWeapon = new MeleeWeapon("Master Sword", 500);
    private Weapon magicalWeapon = new MagicWeapon();


    @Before
    public void setUp() {
        this.melee = new Knight();
    }

    @Test(expected = Exception.class)
    public void validateMagicianWeaponLongRangeTest() throws Exception {
        this.melee.setMainWeapon(this.magicalWeapon);
    }

    @Test(expected = Exception.class)
    public void validateMeleeWeaponLongRangeTest() throws Exception {
        this.melee.setMainWeapon(this.longRangeWeapon);
    }

    @Test
    public void validateWeaponTest() throws Exception {
        this.melee.setMainWeapon(this.meleeWeapon);
    }
}
