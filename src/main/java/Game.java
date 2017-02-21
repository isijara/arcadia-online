import characters.*;
import items.equipment.FireStone;
import items.weapons.LongRangeWeapon;
import items.weapons.MeleeWeapon;
import items.weapons.Weapon;

import java.util.Scanner;

public class Game {

    public void demo(GameCharacter player) {

        Weapon bow      = new LongRangeWeapon("Bow", 500);
        Weapon sword    = new MeleeWeapon("Master Sword", 1200);
        Weapon decoratedSword = new FireStone(sword);

        try {
            player.pickWeapon(bow);
            player.pickWeapon(sword);
            player.pickWeapon(decoratedSword);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        boolean withoutWeapon = true;

        while(withoutWeapon ) {
            player.listWeapons();
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();

            Weapon weapon = player.getWeapons().get(n-1);

            try {
                player.setMainWeapon(weapon);
                withoutWeapon  = false;
            } catch(Exception e) {
                this.printException(e);
            }
        }
    }

    private void printException(Exception e) {
        System.out.println(e.getMessage());
    }


    public static void main(String[] args) {
        Game game = new Game();
        GameCharacterFactory factory = new GameCharacterFactory();

        try {
            GameCharacter knight = factory.create("KNIGHT");
            GameCharacter commander = factory.create("COMMANDER");

            System.out.println("\n\nDemo for Knight");
            game.demo(knight);

            System.out.println("\n\nDemo for Commander");
            game.demo(commander);

        }catch(Exception e) {
            e.printStackTrace();
        }

    }

}
