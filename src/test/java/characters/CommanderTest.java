package characters;

import items.equipment.FireStone;
import items.weapons.MeleeWeapon;
import items.weapons.Weapon;
import items.weapons.WeaponAttackModifier;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Link on 19/02/17.
 */
public class CommanderTest {

    GameCharacter commander = new Commander();
    GameCharacterFactory characterFactory  = new GameCharacterFactory();


    @Before
    public void setUp() {
        try {
            this.commander = this.characterFactory.create(GameCharacterClass.COMMANDER.toString());
        } catch(Exception e) {
            e.printStackTrace();
            this.commander = new Commander();
        }

        try {
            this.commander.setMainWeapon(new MeleeWeapon("Master Sword", 100));
        } catch(Exception e) {
            System.out.println(e.getStackTrace());
        }
    }

    @Test
    public void getAttackTest() {
        double expectedPower = (this.commander.getBaseAttack() * WeaponAttackModifier.MELEE.getValue())  + 100;
        Assert.assertEquals(expectedPower, this.commander.getTotalAttackPower(), 0.1);
    }

    @Test
    public void getAttackWithFireStoneTest() {

        double fireStonePower = 45;
        double expectedPower = (this.commander.getBaseAttack() * WeaponAttackModifier.MELEE.getValue())  + 100 + fireStonePower;

        Weapon weapon = this.commander.getEquippedWeapon();
        weapon = new FireStone(weapon);

        try {
            this.commander.setMainWeapon(weapon);
        } catch(Exception e) {
            System.out.println("here");
            e.printStackTrace();
        }

        Assert.assertEquals(expectedPower, this.commander.getTotalAttackPower(), 0.1);
    }

    @Test
    public void weaponDecoratedWithFireStoneNameTest() {

        Weapon weapon = this.commander.getEquippedWeapon();
        weapon = new FireStone(weapon);

        try {
            this.commander.setMainWeapon(weapon);
        } catch(Exception e) {
            e.printStackTrace();
        }

        Assert.assertEquals("Firestone Master Sword", this.commander.getEquippedWeaponName());
    }
}
