package priorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();

        queue.add(3);
        queue.add(5);
        queue.add(6);
        queue.add(2);
        queue.add(9);

        System.out.println(queue);

        Integer element = queue.poll();
        System.out.println("element " + element);

        Queue<Cat> cats = new PriorityQueue<>(new ByAgeComparator());
        cats.add(new Cat(4,5.6));
        cats.add(new Cat(8,8.9));
        cats.add(new Cat(2,1.3));
        cats.add(new Cat(3,4.3));

        Cat firstCat = cats.poll();
        System.out.println(firstCat);

    }
}



