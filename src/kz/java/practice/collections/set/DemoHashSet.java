package kz.java.practice.collections.set;

import java.util.HashSet;
import java.util.Set;

public class DemoHashSet {
    public static void main(String[] args) {

        Set<Character> gradesGPA = Set.of('A', 'B', 'C', 'D', 'F');
        Set<Character> copy = Set.copyOf(gradesGPA);

        Set<Integer> set = new HashSet<>();
        boolean b1 = set.add(66);
        boolean b2 = set.add(10);
        boolean b3 = set.add(66);
        boolean b4 = set.add(8);

        set.forEach(System.out::println);
    }
}


