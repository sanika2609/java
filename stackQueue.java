import java.util.LinkedList;

// Class that implements both Stack and Queue interfaces
public class StackQueue<T> implements Stack<T>, Queue<T> {
    private LinkedList<T> list = new LinkedList<>();

    // Stack methods
    @Override
    public void push(T item) {
        list.addFirst(item);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.removeFirst();
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    // Queue methods
    @Override
    public void enqueue(T item) {
        list.addLast(item);
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return list.removeFirst();
    }

    @Override
    public T front() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return list.getFirst();
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        StackQueue<Integer> stackQueue = new StackQueue<>();

        // Demonstrate stack functionality
        System.out.println("Stack Operations:");
        stackQueue.push(1);
        stackQueue.push(2);
        stackQueue.push(3);
        System.out.println("Stack peek: " + stackQueue.peek());
        System.out.println("Stack pop: " + stackQueue.pop());
        System.out.println("Stack size: " + stackQueue.size());

        // Demonstrate queue functionality
        System.out.println("\nQueue Operations:");
        stackQueue.enqueue(4);
        stackQueue.enqueue(5);
        stackQueue.enqueue(6);
        System.out.println("Queue front: " + stackQueue.front());
        System.out.println("Queue dequeue: " + stackQueue.dequeue());
        System.out.println("Queue size: " + stackQueue.size());
    }
}
