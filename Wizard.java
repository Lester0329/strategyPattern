package strategyPattern;

public class Wizard implements CharacterType{
    CastSpell castSpell = new CastSpell();
    CreateMagic createMagic = new CreateMagic();
    @Override
    public String attack() {
        String output = new String();
        output += "Wizard " + castSpell.attack();
        return output;
    }

    @Override
    public String defend() {
        String output = new String();
        output += "Wizard " + createMagic.defend();
        return output;
    }
}
