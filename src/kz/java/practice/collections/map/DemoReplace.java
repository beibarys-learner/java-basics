package kz.java.practice.collections.map;

import java.util.HashMap;
import java.util.Map;

public class DemoReplace {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(3, 4);

        Integer original = map.replace(2, 10);
        System.out.println(map);
        map.replaceAll((k, v) -> k + v);
        System.out.println(map);

    }
}
