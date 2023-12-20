package kz.java.practice.collections.queuedeque;

import java.util.LinkedList;
import java.util.Queue;

public class DemoQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(10);
        queue.add(11);
        queue.add(9);
        System.out.println(queue);

        // Queue methods
        System.out.println(queue.remove()); // removing 10
        System.out.println(queue.peek()); // reading from front
        System.out.println(queue);

        System.out.println(queue.element());

    }
}
