import java.util.LinkedList;

class Buffer {
    private LinkedList<Integer> list = new LinkedList<>();
    private int capacity;

    // Constructor to initialize buffer capacity
    public Buffer(int capacity) {
        this.capacity = capacity;
    }

    // Produce an item (add to the buffer)
    public synchronized void produce(int value) throws InterruptedException {
        while (list.size() == capacity) {
            // Wait if the buffer is full
            System.out.println("Buffer is full, producer is waiting...");
            wait();
        }

        // Add value to the buffer
        list.add(value);
        System.out.println("Produced: " + value);

        // Notify the consumer that the buffer is not empty anymore
        notify();
    }

    // Consume an item (remove from the buffer)
    public synchronized int consume() throws InterruptedException {
        while (list.size() == 0) {
            // Wait if the buffer is empty
            System.out.println("Buffer is empty, consumer is waiting...");
            wait();
        }

        // Remove value from the buffer
        int value = list.removeFirst();
        System.out.println("Consumed: " + value);

        // Notify the producer that the buffer is not full anymore
        notify();

        return value;
    }
}

class Producer implements Runnable {
    private Buffer buffer;

    // Constructor to pass shared buffer
    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        int value = 0;
        while (true) {
            try {
                // Produce an item
                buffer.produce(value++);
                Thread.sleep(500); // Simulate time taken to produce
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {
    private Buffer buffer;

    // Constructor to pass shared buffer
    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        while (true) {
            try {
                // Consume an item
                buffer.consume();
                Thread.sleep(1000); // Simulate time taken to consume
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class prac37 {
    public static void main(String[] args) {
        // Create a shared buffer with a capacity of 5
        Buffer buffer = new Buffer(5);

        // Create producer and consumer objects
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        // Create producer and consumer threads
        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        // Start the threads
        producerThread.start();
        consumerThread.start();
    }
}
