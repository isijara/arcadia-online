package characters;

public class GameCharacterFactory {

    public GameCharacter create(String type) throws Exception{

        if( type.equals(GameCharacterClass.KNIGHT))
            return new Knight();
        else if (type.equals(GameCharacterClass.COMMANDER))
            return new Commander();
        else if (type.equals(GameCharacterClass.TROLL))
            return new Troll();
        if( type.equals(GameCharacterClass.ARCHER))
            return new Archer();
        else if (type.equals(GameCharacterClass.WIZARD))
            return new Commander();
        else if (type.equals(GameCharacterClass.OGRE))
            return new Ogre();
        else if (type.equals(GameCharacterClass.PAWN))
            return new Pawn();
        else
            throw new Exception("GameCharacterClass " + type + "does not exist");
    }

}
