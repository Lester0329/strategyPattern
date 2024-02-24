package strategyPattern;

public class Archer implements CharacterType{
    ShootArrow shootArrow = new ShootArrow();
    Shield shield = new Shield();
    @Override
    public String attack() {
        String output = new String();
        output += "Archer" + shootArrow.attack();
        return output;
    }

    @Override
    public String defend() {
        String output = new String();
        output += "Archer" + shield.defend();
        return output;
    }
}
