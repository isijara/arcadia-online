package items.weapons;


public enum WeaponAttackModifier {
    MELEE(1.15), LONG_RANGE(0.85), MAGIC(1.0), NONE(0.0);

    private double attackModifier;

    WeaponAttackModifier(double attackModifier) {
        this.attackModifier = attackModifier;
    }

    public double getValue() {
        return attackModifier;
    }
}
