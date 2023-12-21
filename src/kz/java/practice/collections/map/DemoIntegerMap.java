package kz.java.practice.collections.map;

import java.util.HashMap;
import java.util.Map;

public class DemoIntegerMap {
    public static void main(String[] args) {
        Map<Integer, Character> map = new HashMap<>();
        map.put(1, 'a');
        map.put(2, 'b');
        map.put(3, 'c');
//        map.forEach((k, v) -> System.out.println(v));
//        map.values().forEach(System.out::print);
        map.entrySet().forEach(e->
                System.out.print(e.getKey() + " " + e.getValue()));

        Map<Integer, Character> mapGPA = new HashMap<>();
        mapGPA.put(4, 'A');
        mapGPA.put(3, 'C');
        mapGPA.put(2, 'D');
//        mapGPA.forEach((k, v) -> System.out.println(v));
        System.out.println(mapGPA.get(3));
        System.out.println(mapGPA.get(2));
    }
}
