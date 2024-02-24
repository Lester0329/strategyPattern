package strategyPattern;

public class Character {
    private CharacterType characterType;

    public Character(CharacterType characterType){
        this.characterType = characterType;
    }
    public String attack(){
        return characterType.attack();
    }
    public String defend(){
        return characterType.defend();
    }
}
