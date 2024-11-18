import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args) {
        String input = "programming";
        CharacterFrequency program = new CharacterFrequency();
        Map<Character, Integer> frequencyMap = program.countCharacterFrequency(input);
        program.printFrequency(frequencyMap);
    }

    public Map<Character, Integer> countCharacterFrequency(String input) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : input.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }

    public void printFrequency(Map<Character, Integer> map) {
        System.out.println("Character frequencies:");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

