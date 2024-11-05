package fighter;
public class Wizard extends Fighter {
    private boolean spellPrepared = false;

    public void prepareSpell() {
        spellPrepared = true;
    }

    
    public boolean isVulnerable() {
        return !spellPrepared; 
    }

    
    public int getDamagePoints(Fighter opponent) {
        if (spellPrepared) {
            return 12; 
        } else {
            return 3; 
        }
    } 
    public String toString() {
        return "Fighter is a Wizard";
    }

}
