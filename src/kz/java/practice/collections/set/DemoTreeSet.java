package kz.java.practice.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class DemoTreeSet {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        boolean b1 = set.add(66);
        boolean b2 = set.add(10);
        boolean b3 = set.add(66);
        boolean b4 = set.add(8);

        set.forEach(System.out::println);

        // Numbers implemented the Comparable interface in Java, used for sorting.
    }
}
