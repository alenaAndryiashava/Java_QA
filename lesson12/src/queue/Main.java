package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        boolean werwInserted = queue.add("Hello");
        werwInserted = werwInserted && queue.add("World");
        werwInserted = werwInserted && queue.add("Queue");
        werwInserted = werwInserted && queue.add("In Java");
        System.out.println("Were inserted " + werwInserted);

        System.out.println("Queue " + queue);

        String removedElement = queue.remove();
        System.out.println("Removed element " + removedElement);
        System.out.println("Queue " + queue);


        //peek
        String peekedElement = queue.peek();
        System.out.println("Peeked element " + peekedElement);

        System.out.println("Queue " + queue);

        //element
        String element = queue.element();
        System.out.println("Element " + element);

        System.out.println("Queue " + queue);

        //element() vs peek
        Queue<Integer> emptyQueue = new LinkedList<>();
        Integer peek = emptyQueue.peek();
        System.out.println("Peek in empty queue " + peekedElement);

       /*Integer element1 = emptyQueue.element();// throws exception if queue is empty
        System.out.println("element1 in empty queue " + element1);

        */

        //offer
        boolean wasInserted = queue.offer("String");
        System.out.println("Was inserted " + wasInserted);
        System.out.println("Queue " + queue);

        //offer and add methods differ only if queue has size constraints

        // poll
        String polledElement = queue.poll();
        System.out.println("Polled element " + polledElement);
        System.out.println("Queue " + queue);

        //poll vs remove
        Integer polledFromEmpty = emptyQueue.poll();
        System.out.println("Polled from empty queue " + polledFromEmpty);

        /*Integer removedFromEmpty = emptyQueue.remove();// throws java.util.NoSuchElementException
        System.out.println("Removed from empty queue " + removedFromEmpty);

         */
        // example of polling all elements from the queue
        do{
            String e = queue.poll();
            System.out.println(e);
        }
        while (queue.peek() != null);

        Producer producer = new Producer(5);
        Consumer consumer = new Consumer();

        Queue<Integer> producerConsumerQueue = new LinkedList<>();

        for (int i = 0; i < 11; i++) {
            producerConsumerQueue.offer(producer.getNextInt());
            consumer.consume(producerConsumerQueue.poll());

        }

        System.out.println(producer.getNextInt());
        System.out.println(producer.getNextInt());
        System.out.println(producer.getNextInt());
        System.out.println(producer.getNextInt());
        System.out.println(producer.getNextInt());
        System.out.println(producer.getNextInt());
        System.out.println(producer.getNextInt());

    }
}
