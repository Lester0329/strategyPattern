package strategyPattern;

public class GameApp {
    public static void main (String[] args){
        Character knight = new Character(new Knight());
        Character wizard = new Character(new Wizard());
        Character archer = new Character(new Archer());

        //Attack and defense strategy for knight
        System.out.println(knight.attack());
        System.out.print(knight.defend());
        System.out.println();

        //Attack and defense strategy for wizard
        System.out.println(wizard.attack());
        System.out.println(wizard.defend());
        System.out.println();

        //Attack and defense strategy for archer
        System.out.println(archer.attack());
        System.out.println(archer.defend());
    }
}
