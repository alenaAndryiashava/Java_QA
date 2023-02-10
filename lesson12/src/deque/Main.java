package deque;

import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();

        //methods add offer peek element remove poll as in queue
        //methods push and pop as in stack

        deque.addFirst("Car");// == push
        deque.addFirst("Lesson");
        deque.addFirst("World");
        deque.addLast("Last"); // == add

        //peek() == peekFirst()

        System.out.println(deque);

        // difference between addFirst and offerFirst is as between add offer
    }
}
