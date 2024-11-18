import java.util.HashMap;
import java.util.Map;

public class StudentGrades {
    public static void main(String[] args) {
        StudentGrades program = new StudentGrades();
        Map<String, Integer> gradesMap = program.initializeMap();
        program.removeStudentIfExists(gradesMap, "Tom");
        program.printMap(gradesMap);
    }

    public Map<String, Integer> initializeMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 85);
        map.put("Jane", 92);
        map.put("Tom", 76);
        map.put("Lucy", 89);
        return map;
    }

    public void removeStudentIfExists(Map<String, Integer> map, String student) {
        if (map.containsKey(student)) {
            map.remove(student);
            System.out.println(student + "'s entry has been removed.");
        } else {
            System.out.println(student + " is not in the map.");
        }
    }

    public void printMap(Map<String, Integer> map) {
        System.out.println("Updated student grades:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

