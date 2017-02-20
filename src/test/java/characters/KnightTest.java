package characters;

import items.equipment.FireStone;
import items.weapons.MeleeWeapon;
import items.weapons.Weapon;
import items.weapons.WeaponAttackModifier;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class KnightTest {

    GameCharacter knight;
    GameCharacterFactory characterFactory  = new GameCharacterFactory();


    @Before
    public void setUp() {
        try {
            this.knight = this.characterFactory.create(GameCharacterClass.KNIGHT.toString());
        } catch(Exception e) {
            e.printStackTrace();
            this.knight = new Commander();
        }

        try {
            this.knight.setMainWeapon(new MeleeWeapon("Elementary Sword", 100));
        } catch(Exception e) {
            System.out.println(e.getStackTrace());
        }
    }

    @Test
    public void getAttackTest() {
        double expectedPower = (this.knight.getBaseAttack() * WeaponAttackModifier.MELEE.getValue())  + 100;
        Assert.assertEquals(expectedPower, this.knight.getTotalAttackPower(), 0.1);
    }

    @Test
    public void getAttackWithFireStoneTest() {

        double fireStonePower = 45;
        double expectedPower = (this.knight.getBaseAttack() * WeaponAttackModifier.MELEE.getValue())  + 100 + fireStonePower;

        Weapon weapon = this.knight.getEquippedWeapon();
        weapon = new FireStone(weapon);

        try {
            this.knight.setMainWeapon(weapon);
        } catch(Exception e) {
            System.out.println("here");
            e.printStackTrace();
        }

        Assert.assertEquals(expectedPower, this.knight.getTotalAttackPower(), 0.1);
    }

    @Test
    public void weaponDecoratedWithFireStoneNameTest() {

        Weapon weapon = this.knight.getEquippedWeapon();
        weapon = new FireStone(weapon);

        try {
            this.knight.setMainWeapon(weapon);
        } catch(Exception e) {
            e.printStackTrace();
        }

        Assert.assertEquals("Firestone Elementary Sword", this.knight.getEquippedWeaponName());
    }
}
