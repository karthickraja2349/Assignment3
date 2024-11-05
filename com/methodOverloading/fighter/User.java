package fighter;
public class User {
    public static void main(String[] args) {
        Character character = new Character();
        character.setCharacterClass("Wizard");
        character.setLevel(4);
        character.setHitPoints(28);

        Destination destination = new Destination();
        destination.setName("Muros");
        destination.setInhabitants(732);

        GameMaster gameMaster = new GameMaster();

        System.out.println(gameMaster.describe(character)); // Character description
        System.out.println(gameMaster.describe(destination)); // Destination description
        System.out.println(gameMaster.describe(TravelMethod.HORSEBACK)); // Travel method description
        System.out.println(gameMaster.describe(character, destination, TravelMethod.HORSEBACK)); // Full description with travel method
        System.out.println(gameMaster.describe(character, destination)); // Full description with default travel method (walking)
    }
}

