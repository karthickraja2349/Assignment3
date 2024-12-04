import java.util.Objects;

public class HashTableLinearProbing {

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

    
    public HashTableLinearProbing() {
        this(10); 
    }

   
    public HashTableLinearProbing(int capacity) {
        table = new HashNode[capacity];
        numOfBuckets = capacity;
        size = 0;
    }

    
    private int getBucketIndex(Integer key) {
        return Math.abs(key.hashCode()) % numOfBuckets;
    }

   
    public void put(Integer key, String value) {
        int bucketIndex = getBucketIndex(key);
        int originalIndex = bucketIndex;

        // Linear probing to find  appropriate index
        while (table[bucketIndex] != null && table[bucketIndex] != DELETED) {
            if (Objects.equals(table[bucketIndex].key, key)) {
                table[bucketIndex].value = value;
                return;
            }
            bucketIndex = (bucketIndex + 1) % numOfBuckets; // Linear probing to next index
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

        // Linear probing to find the key
        while (table[bucketIndex] != null) {
            if (Objects.equals(table[bucketIndex].key, key)) {
                return table[bucketIndex].value;
            }
            bucketIndex = (bucketIndex + 1) % numOfBuckets; // Linear probing to next index
            if (bucketIndex == originalIndex) {
                break; 
            }
        }
        return null; 
    }

 
    public String remove(Integer key) {
        int bucketIndex = getBucketIndex(key);
        int originalIndex = bucketIndex;

        // Linear probing to find  key to remove
        while (table[bucketIndex] != null) {
            if (Objects.equals(table[bucketIndex].key, key)) {
                String value = table[bucketIndex].value;
                table[bucketIndex] = DELETED; 
                size--;
                return value; 
            }
            bucketIndex = (bucketIndex + 1) % numOfBuckets; // Linear probing to next index
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

        // Linear probing to find  key
        while (table[bucketIndex] != null) {
            if (Objects.equals(table[bucketIndex].key, key)) {
                return true; 
            }
            bucketIndex = (bucketIndex + 1) % numOfBuckets; // Linear probing to next index
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
}

