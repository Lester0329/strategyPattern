# strategyPattern

Problem Scenario
Suppose we have three types of characters in a GameApp:

Knight: Attacks with a sword; uses 3 strategies to defend (shield, dodge, magic barrier)
Wizard: Casts spells; uses magic barrier to defend
Archer: Shoots arrows; uses dodge to to defend
Implement two types of Strategy: A. DefenseStrategy 1. Shield 2. Dodge 3. CreateMagic

B. AttackStrategy 1. CastSpell 2. ShootArrow 3. SwingSword

Refactor the existing codes and provide the UML Diagram:

public class Character { private String type;

public Character(String type) {
    this.type = type;
}

public void attack() {
    if (type.equals("Knight")) {
        System.out.println("Knight attacks with a sword!");
    } else if (type.equals("Wizard")) {
        System.out.println("Wizard casts a spell!");
    } else if (type.equals("Archer")) {
        System.out.println("Archer shoots an arrow!");
    }
}

public void defend() {
    if (type.equals("Knight")) {
        System.out.println("Using a shield to defend!");
        System.out.println("Dodgin to avoid attack!");
        System.out.println("Creating a magic barrier for defense!"");		

      } else if (type.equals("Wizard")) {
          System.out.println("Creating a magic barrier for defense!"");
      } else if (type.equals("Archer")) {
          System.out.println("Using a shield to defend!"");
      }
    }
}

UML CLASS DIAGRAM

![image](https://github.com/Lester0329/strategyPattern/assets/72334101/5d68a07f-b155-48da-bbce-8c8fc2f9b902)
