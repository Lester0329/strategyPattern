package strategyPattern;

public class Dodge implements DefenseStrategy{
    @Override
    public String defend() {
        String output = new String();
        output += " dodgin to avoid attack!";
        return output;
    }
}
