package strategyPattern;

public class CreateMagic implements DefenseStrategy{
    @Override
    public String defend() {
        String output = new String();
        output += " creating magic barrier for defense!";
        return output;
    }
}
