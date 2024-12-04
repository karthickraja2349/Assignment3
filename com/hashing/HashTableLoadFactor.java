import java.util.Objects;

public class HashTableLoadFactor{

    private class HashNode {
        private Integer key;
        private String value;

        HashNode(Integer key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private HashNode[] table;
    private int size;
    private int numOfBuckets;
    private  final HashNode DELETED = new HashNode(null, null);

    private  final double LOAD_FACTOR_THRESHOLD = 0.75;

    public HashTableLoadFactor() {
        this(10);
    }

    public HashTableLoadFactor(int capacity) {
        table = new HashNode[capacity];
        numOfBuckets = capacity;
        size = 0;
    }

    private int getBucketIndex(Integer key) {
        return Math.abs(key.hashCode()) % numOfBuckets;
    }

    private double getLoadFactor() {
        return (double) size / numOfBuckets;
    }

    private void rehash() {
        System.out.println("Rehashing...");
        HashNode[] oldTable = table;
        numOfBuckets = numOfBuckets * 2;  
        table = new HashNode[numOfBuckets];
        size = 0;

        // Re-insert all elements 
        for (HashNode node : oldTable) {
            if (node != null && node != DELETED) {
                put(node.key, node.value);
            }
        }
    }

    public void put(Integer key, String value) {
        if (getLoadFactor() > LOAD_FACTOR_THRESHOLD) {
            rehash();
        }

        int bucketIndex = getBucketIndex(key);
        int originalIndex = bucketIndex;

       
        while (table[bucketIndex] != null && table[bucketIndex] != DELETED) {
            if (Objects.equals(table[bucketIndex].key, key)) {
                table[bucketIndex].value = value;
                return;
            }
            bucketIndex = (bucketIndex + 1) % numOfBuckets; 
            if (bucketIndex == originalIndex) {
                throw new IllegalStateException("Hash table is full");
            }
        }

        table[bucketIndex] = new HashNode(key, value);
        size++;
    }

    public String get(Integer key) {
        int bucketIndex = getBucketIndex(key);
        int originalIndex = bucketIndex;

        
        while (table[bucketIndex] != null) {
            if (Objects.equals(table[bucketIndex].key, key)) {
                return table[bucketIndex].value;
            }
            bucketIndex = (bucketIndex + 1) % numOfBuckets; 
            if (bucketIndex == originalIndex) {
                break;
            }
        }
        return null;
    }

    public String remove(Integer key) {
        int bucketIndex = getBucketIndex(key);
        int originalIndex = bucketIndex;

     
        while (table[bucketIndex] != null) {
            if (Objects.equals(table[bucketIndex].key, key)) {
                String value = table[bucketIndex].value;
                table[bucketIndex] = DELETED;
                size--;
                return value;
            }
            bucketIndex = (bucketIndex + 1) % numOfBuckets; 
            if (bucketIndex == originalIndex) {
                break;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("{");
        for (int i = 0; i < numOfBuckets; i++) {
            if (table[i] != null && table[i] != DELETED) {
                result.append(table[i].key).append("=").append(table[i].value).append(" ");
            }
        }
        result.append("}");
        return result.toString().trim();
    }

    public boolean containsKey(Integer key) {
        int bucketIndex = getBucketIndex(key);
        int originalIndex = bucketIndex;

       
        while (table[bucketIndex] != null) {
            if (Objects.equals(table[bucketIndex].key, key)) {
                return true;
            }
            bucketIndex = (bucketIndex + 1) % numOfBuckets;
            if (bucketIndex == originalIndex) {
                break;
            }
        }
        return false;
    }

    public boolean containsValue(String value) {
        for (int i = 0; i < numOfBuckets; i++) {
            if (table[i] != null && table[i] != DELETED && Objects.equals(table[i].value, value)) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        table = new HashNode[numOfBuckets];
        size = 0;
    }

    public static void main(String[] args) {
        HashTableLoadFactor hashTable = new HashTableLoadFactor(4);


        // Adding elements to hash table
        hashTable.put(1, "One");
        hashTable.put(2, "Two");
        hashTable.put(3, "Three");

        System.out.println("Before rehashing: " + hashTable);
        System.out.println("Size: " + hashTable.size());

        // Adding more elements to exceed the load factor threshold
        hashTable.put(4, "Four");
        hashTable.put(5, "Five");

        System.out.println("After rehashing: " + hashTable);
        System.out.println("Size: " + hashTable.size());
    }
}

