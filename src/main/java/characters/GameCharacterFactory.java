package characters;

public class GameCharacterFactory {

    public GameCharacter create(String type) throws Exception {

        switch(type) {
            case "KNIGHT":
                return new Knight();
            case "COMMANDER":
                return new Commander();
            case "TROLL":
                return new Troll();
            case "ARCHER":
                return new Archer();
            case "WIZARD":
                return new Wizard();
            case "OGRE":
                return new Ogre();
            case "PAWN":
                return new Pawn();
            default:
                throw new Exception("GameCharacterClass" + type + "does not exist");
        }
    }
}
