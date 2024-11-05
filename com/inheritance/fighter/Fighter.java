package fighter;
public abstract class Fighter {
    public abstract boolean isVulnerable();
    public abstract int getDamagePoints(Fighter opponent);

  
    public abstract String toString();
}
