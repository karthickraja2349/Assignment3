package fighter;
public class User {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Wizard wizard = new Wizard();

        System.out.println(warrior.toString()); 
        System.out.println(warrior.isVulnerable()); 
        System.out.println(warrior.getDamagePoints(wizard)); 

        System.out.println(wizard.toString()); 
        System.out.println(wizard.isVulnerable()); 
        
        wizard.prepareSpell();
        System.out.println(wizard.isVulnerable()); 
        System.out.println(wizard.getDamagePoints(warrior)); 
    }
}

    

