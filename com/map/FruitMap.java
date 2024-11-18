import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class FruitMap {
    public static void main(String[] args) {
        FruitMap program = new FruitMap();
        TreeMap<String, Integer> map = program.initializeMap();
        program.printMap(map);
    }

    public TreeMap<String, Integer> initializeMap() {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("banana", 2);
        map.put("apple", 5);
        map.put("cherry", 7);
        map.put("date", 3);
        return map;
    }

    public void printMap(TreeMap<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

