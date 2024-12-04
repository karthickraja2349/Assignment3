public class Students {
    public static void main(String[] args) {
       
        HashMap<String> map = new HashMap<>();

        
        map.put("Alice", "A");
        map.put("Bob", "B");
        map.put("Charlie", "C");
        map.put("Alice", "A+");  // Same name, different grade (collision scenario)
        map.put("David", "B+");

        
        System.out.println("HashMap: " + map);

        
        System.out.println("Contains 'Alice'? " + map.containsKey("Alice"));
        System.out.println("Contains 'Eve'? " + map.containsKey("Eve"));

        
        System.out.println("Contains grade 'A'? " + map.containsValue("A"));
        System.out.println("Contains grade 'D'? " + map.containsValue("D"));

        
        System.out.println("Removed: " + map.remove("Bob"));

        
        System.out.println("HashMap after removal: " + map);
    }
}

