package characters;

import characters.weaponPolicies.LongRangeWarriorWeaponPolicy;

public class Archer extends GameCharacter implements Attacker {

    public Archer() {
        this.setWeaponPolicy(new LongRangeWarriorWeaponPolicy());
    }

    @Override
    public void attack() {

    }

}
