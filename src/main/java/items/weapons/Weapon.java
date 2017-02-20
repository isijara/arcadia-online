package items.weapons;

public abstract class Weapon {

    protected double attack;
    protected double attackModifier;
    protected String name;
    protected double price;

    public Weapon() {}

    public Weapon(String name, double attack, WeaponAttackModifier attackModifier) {
        this.name = name;
        this.attack = attack;
        this.attackModifier = attackModifier.getValue();
    }

    public abstract double getAttack();
    public abstract double getAttackModifier();
    public abstract String getName();

    public String toString() {
        return this.getName() + " Atk: "+ this.getAttack();
    }
}

