package characters;

import characters.weaponPolicies.LongRangeWarriorWeaponPolicy;

/**
 * Created by proyectos on 13/05/16.
 */
public class Archer extends GameCharacter {

    public Archer() {
        this.setWeaponPolicy(new LongRangeWarriorWeaponPolicy());
    }

    @Override
    public void attack() {

    }

}
