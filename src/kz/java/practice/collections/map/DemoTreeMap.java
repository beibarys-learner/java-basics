package kz.java.practice.collections.map;

import java.util.Map;
import java.util.TreeMap;

public class DemoTreeMap {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();
        map.put("koala", "bamboo");
        map.put("lion", "meat");
        map.put("giraffe", "leaf");

        String food = map.get("koala");
        for (String key: map.keySet())
            System.out.print(key + ",");
        System.out.println(" ");
        System.out.println(map.values());

        System.out.println(map.containsKey("lion"));
        System.out.println(map.containsValue("lion"));
        System.out.println(map.size());
        map.clear();
        System.out.println(map.isEmpty());

    }
}
