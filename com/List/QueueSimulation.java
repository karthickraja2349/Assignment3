import java.util.LinkedList;
import java.util.Queue;

public class QueueSimulation {
    public static void main(String[] args) {
        Queue<String> queue = initializeQueue();
        processQueue(queue);
        printQueue(queue);
    }

    public static Queue<String> initializeQueue() {
        Queue<String> queue = new LinkedList<>();
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");
        queue.add("Diana");
        return queue;
    }

    public static void processQueue(Queue<String> queue) {
        if (!queue.isEmpty()) {
            queue.poll(); 
        }
        if (!queue.isEmpty()) {
            queue.poll();
        }
    }

    public static void printQueue(Queue<String> queue) {
        System.out.println("Remaining names in the queue: " + queue);
    }
}