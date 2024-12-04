import java.util.Objects;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class HashMap<T> {
    private class HashNode<T> {
        private T key;
        private T value;
        private HashNode<T> next;

        HashNode(T key, T value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private HashNode<T>[] buckets;
    private int size;
    private int numOfBuckets;

    public HashMap() {
        this(10);
    }

    public HashMap(int capacity) {
        buckets = new HashNode[capacity];
        numOfBuckets = capacity;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void clear() {
        size = 0;
        Arrays.fill(buckets, null);
    }

    private int getBucketIndex(T key) {
        if (key == null) return 0;
        int keyHashCode = key.hashCode();
        return Math.abs(keyHashCode) % numOfBuckets;
    }

    public void put(T key, T value) {
        int bucketIndex = getBucketIndex(key);
        HashNode<T> head = buckets[bucketIndex];
        while (head != null) {
            if (Objects.equals(head.key, key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        size++;
        HashNode<T> newNode = new HashNode<>(key, value);
        newNode.next = buckets[bucketIndex];
        buckets[bucketIndex] = newNode;
    }

    public T remove(T key) {
        int bucketIndex = getBucketIndex(key);
        HashNode<T> head = buckets[bucketIndex];
        HashNode<T> previous = null;
        while (head != null) {
            if (Objects.equals(head.key, key)) {
                break;
            }
            previous = head;
            head = head.next;
        }

        if (head == null) return null; // Key not found

        size--;
        if (previous != null) {
            previous.next = head.next;
        } else {
            buckets[bucketIndex] = head.next;
        }

        return head.value; // Return the removed value
    }

    public String toString() {
        StringBuilder result = new StringBuilder("{");
        for (int i = 0; i < numOfBuckets; i++) {
            HashNode<T> head = buckets[i];
            while (head != null) {
                result.append(head.key).append("=").append(head.value).append(" ");
                head = head.next;
            }
        }
        result.append("}");
        return result.toString().trim();
    }

    public boolean containsKey(T key) {
        int bucketIndex = getBucketIndex(key);
        HashNode<T> head = buckets[bucketIndex];
        while (head != null) {
            if (Objects.equals(head.key, key)) return true;
            head = head.next;
        }
        return false;
    }

    public boolean containsValue(T value) {
        for (HashNode<T> bucket : buckets) {
            HashNode<T> head = bucket;
            while (head != null) {
                if (Objects.equals(head.value, value)) return true;
                head = head.next;
            }
        }
        return false;
    }

    public List<T> keySet() {
        List<T> list = new ArrayList<>();
        for (int i = 0; i < numOfBuckets; i++) {
            HashNode<T> head = buckets[i];
            while (head != null) {
                list.add(head.key);
                head = head.next;
            }
        }
        return list;
    }

    public List<T> values() {
        List<T> list = new ArrayList<>();
        for (int i = 0; i < numOfBuckets; i++) {
            HashNode<T> head = buckets[i];
            while (head != null) {
                list.add(head.value);
                head = head.next;
            }
        }
        return list;
    }
}


