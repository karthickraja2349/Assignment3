package fighter;
public class Warrior extends Fighter {

    public boolean isVulnerable() {
        return false; 
    }

   
    public int getDamagePoints(Fighter opponent) {
        if (opponent.isVulnerable()) {
            return 10; 
        } else {
            return 6;
        }
    }

    
    public String toString() {
        return "Fighter is a Warrior";
    }
}
