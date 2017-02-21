package characters;

import items.equipment.FireStone;
import items.weapons.LongRangeWeapon;
import items.weapons.MeleeWeapon;
import items.weapons.Weapon;
import items.weapons.WeaponAttackModifier;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Link on 20/02/17.
 */
public class ArcherTest {

    GameCharacter archer;
    GameCharacterFactory characterFactory  = new GameCharacterFactory();


    @Before
    public void setUp() {
        try {
            this.archer = this.characterFactory.create(GameCharacterClass.ARCHER.toString());
        } catch(Exception e) {
            e.printStackTrace();
            this.archer = new Commander();
        }

        try {
            this.archer.setMainWeapon(new LongRangeWeapon("Hylian Bow", 100));
        } catch(Exception e) {
            System.out.println(e.getStackTrace());
        }
    }

    @Test
    public void getAttackTest() {
        double expectedPower = (this.archer.getBaseAttack() * WeaponAttackModifier.LONG_RANGE.getValue())  + 100;
        Assert.assertEquals(expectedPower, this.archer.getTotalAttackPower(), 0.1);
    }

    @Test
    public void getAttackWithFireStoneTest() {

        double fireStonePower = 45;
        double expectedPower = (this.archer.getBaseAttack() * WeaponAttackModifier.LONG_RANGE.getValue())  + 100 + fireStonePower;

        Weapon weapon = this.archer.getEquippedWeapon();
        weapon = new FireStone(weapon);

        try {
            this.archer.setMainWeapon(weapon);
        } catch(Exception e) {
            System.out.println("here");
            e.printStackTrace();
        }

        Assert.assertEquals(expectedPower, this.archer.getTotalAttackPower(), 0.1);
    }

    @Test
    public void weaponDecoratedWithFireStoneNameTest() {

        Weapon weapon = this.archer.getEquippedWeapon();
        weapon = new FireStone(weapon);

        try {
            this.archer.setMainWeapon(weapon);
        } catch(Exception e) {
            e.printStackTrace();
        }

        Assert.assertEquals("Firestone Hylian Bow", this.archer.getEquippedWeaponName());
    }
}
