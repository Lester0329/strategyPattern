package strategyPattern;

public class Knight implements CharacterType{
    SwingSword swingSword = new SwingSword();
    Shield shield = new Shield();
    Dodge dodge = new Dodge();
    CreateMagic createMagic = new CreateMagic();
    @Override
    public String attack() {
        String output = new String();
        output += "Knight " + swingSword.attack();
        return output;
    }

    @Override
    public String defend() {
        String output = new String();
        output += "Knight " + shield.defend() + "\n";
        output += "Knight " + dodge.defend() + "\n";
        output += "Knight " + createMagic.defend() + "\n";
        return output;
    }
}
