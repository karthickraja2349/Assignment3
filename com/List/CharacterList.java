import java.util.List;
import java.util.ArrayList;

public class CharacterList {
    private List<Character> charList;

    public CharacterList() {
        charList = new ArrayList<>();
    }

    public void addCharacter(char ch) {
        charList.add(ch);
    }

    public int findCharacterIndex(char ch) {
        for (int i = 0; i < charList.size(); i++) {
            if (charList.get(i) == ch) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        CharacterList characterList = new CharacterList();
        characterList.addCharacter('A');
        characterList.addCharacter('B');
        characterList.addCharacter('C');
        characterList.addCharacter('D');
        characterList.addCharacter('E');
        characterList.addCharacter('F');
        characterList.addCharacter('G');
        characterList.addCharacter('H');
        characterList.addCharacter('I');
        characterList.addCharacter('J');

        char targetChar = 'E';
        int index = characterList.findCharacterIndex(targetChar);
        System.out.println("Index of character '" + targetChar + "': " + index);

        targetChar = 'Z';
        index = characterList.findCharacterIndex(targetChar);
        System.out.println("Index of character '" + targetChar + "': " + index);
    }
}
