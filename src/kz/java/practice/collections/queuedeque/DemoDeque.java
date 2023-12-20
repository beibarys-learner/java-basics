package kz.java.practice.collections.queuedeque;

import java.util.Deque;
import java.util.LinkedList;

public class DemoDeque {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        // working with a Deque
        deque.offerFirst(10);
        deque.offerLast(4);

        deque.peekFirst();
        deque.pollFirst();
        deque.pollLast();
        deque.pollFirst();
        deque.peekFirst();



    }
}
