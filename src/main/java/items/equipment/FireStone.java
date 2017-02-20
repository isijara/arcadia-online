package items.equipment;

import characters.GameCharacter;
import items.weapons.Weapon;

/**
 * Created by Link on 20/02/17.
 */
public class FireStone extends WeaponDecorator implements Equipment {

    private double attack = 45;
    private Weapon weapon;

    public FireStone(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public double getAttack() {
        return this.attack + this.weapon.getAttack();
    }

    @Override
    public double getAttackModifier() {
        return this.weapon.getAttackModifier();
    }

    @Override
    public String getName() {
        return "Firestone " + this.weapon.getName();
    }
}
