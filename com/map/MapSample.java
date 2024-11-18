import java.util.HashMap;
import java.util.Map;

public class MapSample {
    public static void main(String[] args) {
        MapSample mapSample = new MapSample();
        Map<String, Integer> people = mapSample.createMap();
        System.out.println("Age of Charlie: " + mapSample.getAge(people, "Charlie"));
        mapSample.printAll(people);
    }

    public HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 30);
        map.put("Bob", 25);
        map.put("Charlie", 35);
        map.put("Diana", 28);
        map.put("Edward", 40);
        return map;
    }

    public int getAge(Map<String, Integer> map, String name) {
        return map.get(name);
    }

    public void printAll(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}


