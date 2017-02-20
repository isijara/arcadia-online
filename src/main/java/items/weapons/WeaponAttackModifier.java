package items.weapons;

/**
 * Created by proyectos on 13/05/16.
 */
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
