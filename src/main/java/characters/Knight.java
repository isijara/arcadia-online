package characters;

import characters.weaponPolicies.MeleeWarriorWeaponPolicy;

public class Knight extends GameCharacter implements Attacker {

    public Knight() {
        this.setWeaponPolicy(new MeleeWarriorWeaponPolicy());
        this.baseAttack = 150;
    }

    @Override
    public double getTotalAttackPower() {
        double totalAttackPower = super.getTotalAttackPower();
        return totalAttackPower;
    }

    @Override
    public void attack() {
        System.out.println("Attacking with a total force of " + this.getTotalAttackPower());
    }

    @Override
    public double getBaseAttack() {
        return this.baseAttack;
    }






}

