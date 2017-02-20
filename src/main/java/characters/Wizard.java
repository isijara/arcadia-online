package characters;

import characters.weaponPolicies.MagicWarriorWeaponPolicy;

public class Wizard extends GameCharacter implements Attacker {

    public Wizard() {
        this.setWeaponPolicy(new MagicWarriorWeaponPolicy());
    }

    @Override
    public void attack() {

    }

}
