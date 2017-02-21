package characters;

import characters.weaponPolicies.LongRangeWarriorWeaponPolicy;

public class Archer extends GameCharacter implements Attacker {

    public Archer() {
        this.setWeaponPolicy(new LongRangeWarriorWeaponPolicy());
        this.baseAttack = 100;
    }

    @Override
    public void attack() {

    }

}
