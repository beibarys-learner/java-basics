package kz.java.practice.collections.map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("KZ", "Astana");
        map.put("RU", "Moscow");
        map.put("UAE", "Abu Dhabi");
        System.out.println(map);

        String food = map.get("KZ");
        System.out.println(food);
        for (String key: map.keySet())
            System.out.print(key + ",");

    }
}
