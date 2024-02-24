package strategyPattern;

public class Shield implements DefenseStrategy{
    @Override
    public String defend() {
        String output = new String();
        output += " using shield to defend!";
        return output;
    }
}
