package characters;

import characters.weaponPolicies.MeleeWarriorWeaponPolicy;

public class Commander extends GameCharacter implements Attacker {

    public Commander() {
        this.setWeaponPolicy(new MeleeWarriorWeaponPolicy());
        this.baseAttack = 200;
    }

    @Override
    public void attack() {
        System.out.println(this.getName() + " is attacking with: " + this.getTotalAttackPower());
    }



}
