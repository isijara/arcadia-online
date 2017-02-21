package characters;

import characters.weaponPolicies.WeaponPolicy;
import items.equipment.Equipment;
import items.weapons.Weapon;
import items.weapons.Weaponless;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;


public abstract class GameCharacter {

    private String name;
    protected double baseAttack;


    protected Weapon equippedWeapon;
    protected List<Weapon> weaponSet = new ArrayList();
    protected List<Equipment> equipment = new ArrayList();

    private WeaponPolicy weaponPolicy;

    private int weaponLimit = 3;
    private double health;


    public GameCharacter() {
        this.equippedWeapon = new Weaponless();
        System.out.println("Currently weilding: " + this.equippedWeapon.toString());
    }

    public List<Weapon> getWeapons() {
        return this.weaponSet;
    }

    public double getAttackModifier() {
        return this.equippedWeapon.getAttackModifier();
    }

    public Weapon getEquippedWeapon() {
        return this.equippedWeapon;
    }

    public String getEquippedWeaponName() {
        return this.equippedWeapon.getName();
    }

    public double getBaseAttack() {
        return this.baseAttack;
    }

    public String getName() {
        return this.name;
    }

    public void pickWeapon(Weapon weapon) throws Exception {
        if(this.weaponSet.size() >= this.weaponLimit )
            throw new Exception("You can't carry more weapons");

        this.weaponSet.add(weapon);
    }

    public double getTotalAttackPower() {
        return (this.getBaseAttack() * this.equippedWeapon.getAttackModifier())
                + this.equippedWeapon.getAttack();
    }


    public final void setWeaponPolicy(WeaponPolicy weaponPolicy) {
        this.weaponPolicy = weaponPolicy;
    }

    public final void setMainWeapon(Weapon weapon) throws Exception{
        this.validateWeapon(weapon);
        this.equippedWeapon = weapon;
    }

    public void listWeapons() {
        System.out.println("Available weapons: ");
        IntStream.iterate(0, i -> i+1 )
                .limit(this.weaponSet.size())
                .forEach(item -> System.out.println((item+1)+ ".-" + this.weaponSet.get(item).toString()));
    }

    public boolean validateWeapon(Weapon weapon) throws Exception{
        if(weaponPolicy == null) {
            throw new Exception("Characters must have a weapon policy");
        }

        return this.weaponPolicy.validateWeapon(weapon);
    }

    public void setName(String name) throws Exception {
        if(this.name != null) {
            throw new Exception("Name already defined. You can't change your character name");
        } else {
            this.name = name;
        }
    }


}
