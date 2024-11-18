import java.util.HashMap;
import java.util.Map;

public class MapMerge {
    public static void main(String[] args) {
        MapMerge program = new MapMerge();

        Map<String, Integer> map1 = program.initializeMap1();
        Map<String, Integer> map2 = program.initializeMap2();

        Map<String, Integer> mergedMap = program.mergeMaps(map1, map2);

        program.printMap(mergedMap);
    }

    public Map<String, Integer> initializeMap1() {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        return map;
    }

    public Map<String, Integer> initializeMap2() {
        Map<String, Integer> map = new HashMap<>();
        map.put("b", 3);
        map.put("c", 4);
        return map;
    }

    public Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
     
        Map<String, Integer> mergedMap = new HashMap<>(map1);
        mergedMap.putAll(map2);
        return mergedMap;
    }

    public void printMap(Map<String, Integer> map) {
        System.out.println("Merged map:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

