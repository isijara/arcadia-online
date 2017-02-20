package characters;

public class GameCharacterFactory {

    public GameCharacter create(String type) throws Exception{

        if( type.equals(GameCharacterClass.KNIGHT.toString()))
            return new Knight();
        else if (type.equals(GameCharacterClass.COMMANDER.toString()))
            return new Commander();
        else if (type.equals(GameCharacterClass.TROLL.toString()))
            return new Troll();
        if( type.equals(GameCharacterClass.ARCHER.toString()))
            return new Archer();
        else if (type.equals(GameCharacterClass.WIZARD.toString()))
            return new Commander();
        else if (type.equals(GameCharacterClass.OGRE.toString()))
            return new Ogre();
        else if (type.equals(GameCharacterClass.PAWN.toString()))
            return new Pawn();
        else
            throw new Exception("GameCharacterClass " + type + " does not exist");
    }

}
