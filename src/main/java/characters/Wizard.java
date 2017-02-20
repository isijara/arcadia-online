package characters;

import characters.weaponPolicies.MagicWarriorWeaponPolicy;

/**
 * Created by proyectos on 13/05/16.
 */
public class Wizard extends GameCharacter {

    public Wizard() {
        this.setWeaponPolicy(new MagicWarriorWeaponPolicy());
    }

    @Override
    public void attack() {

    }

}
