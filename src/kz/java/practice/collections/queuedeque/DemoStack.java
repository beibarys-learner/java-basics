package kz.java.practice.collections.queuedeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DemoStack {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(4);
        System.out.println(stack);
        stack.peek();
        stack.poll();
        stack.poll();
        stack.peek();
    }
}
