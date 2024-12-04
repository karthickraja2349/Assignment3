import java.util.Objects;
import java.util.LinkedList;

public class HashTable {

    private class HashNode {
        private Integer key;
        private String value;

        HashNode(Integer key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<HashNode>[] buckets;
    private int size;
    private int numOfBuckets;

    public HashTable() {
        this(10); 
    }

    public HashTable(int capacity) {
        buckets = new LinkedList[capacity];
        numOfBuckets = capacity;
        size = 0;

       
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    private int getBucketIndex(Integer key) {
        return Math.abs(key.hashCode()) % numOfBuckets;
    }

    public void put(Integer key, String value) {
        int bucketIndex = getBucketIndex(key);
        LinkedList<HashNode> bucket = buckets[bucketIndex];

        
        for (HashNode node : bucket) {
            if (Objects.equals(node.key, key)) {
                node.value = value; 
                return;
            }
        }

     
        bucket.add(new HashNode(key, value));
        size++;
    }

    public String get(Integer key) {
        int bucketIndex = getBucketIndex(key);
        LinkedList<HashNode> bucket = buckets[bucketIndex];

       
        for (HashNode node : bucket) {
            if (Objects.equals(node.key, key)) {
                return node.value; 
            }
        }
        return null; 
    }

    public String remove(Integer key) {
        int bucketIndex = getBucketIndex(key);
        LinkedList<HashNode> bucket = buckets[bucketIndex];

       
        for (HashNode node : bucket) {
            if (Objects.equals(node.key, key)) {
                bucket.remove(node);
                size--;
                return node.value; 
            }
        }
        return null; 
    }

    public String toString() {
        StringBuilder result = new StringBuilder("{");
        for (int i = 0; i < numOfBuckets; i++) {
            LinkedList<HashNode> bucket = buckets[i];
            for (HashNode node : bucket) {
                result.append(node.key).append("=").append(node.value).append(" ");
            }
        }
        result.append("}");
        return result.toString().trim();
    }

    public boolean containsKey(Integer key) {
        int bucketIndex = getBucketIndex(key);
        LinkedList<HashNode> bucket = buckets[bucketIndex];

        
        for (HashNode node : bucket) {
            if (Objects.equals(node.key, key)) {
                return true; 
            }
        }
        return false; 
    }

    public boolean containsValue(String value) {
        for (int i = 0; i < numOfBuckets; i++) {
            LinkedList<HashNode> bucket = buckets[i];
            for (HashNode node : bucket) {
                if (Objects.equals(node.value, value)) {
                    return true; 
                }
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
        size = 0;
        for (int i = 0; i < numOfBuckets; i++) {
            buckets[i].clear(); 
        }
    }
}


