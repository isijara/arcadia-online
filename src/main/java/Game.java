import characters.*;
import items.weapons.LongRangeWeapon;
import items.weapons.MeleeWeapon;
import items.weapons.Weapon;

public class Game {

    public void demo(GameCharacter player) {
        Weapon bow      = new LongRangeWeapon("Bow", 500);
        Weapon sword    = new MeleeWeapon("Master Sword", 1200);

        try {
            player.pickWeapon(bow);
            player.pickWeapon(sword);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        boolean withoutWeapon = true;
        /*while(withoutWeapon ) {
            try {
                player.setMainWeapon();
                withoutWeapon  = false;
            } catch(Exception e) {
                this.printException(e);
            }

        }*/

    }

    private void printException(Exception e) {
        System.out.println(e.getMessage());
    }

    public static void main(String[] args) {
        Game game = new Game();

        GameCharacter knight = new Knight();
        GameCharacter commander = new Commander();

        game.demo(knight);

        System.out.println("\n\nDemo for Commander");
        game.demo(commander);
    }

}
