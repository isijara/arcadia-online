package characters;

import characters.weaponPolicies.MeleeWarriorWeaponPolicy;

public class Commander extends GameCharacter {

    public Commander() {
        this.setWeaponPolicy(new MeleeWarriorWeaponPolicy());
    }

    @Override
    public void attack() {
        System.out.println(this.getName() + " is attacking with: " + this.getTotalAttackPower());
    }



}
