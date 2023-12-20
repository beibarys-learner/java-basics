package kz.java.practice.collections.list;

import java.util.ArrayList;
import java.util.List;

public class DemoConvertList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("dog");
        list.add("cat");
        System.out.println(list);

        Object[] objectArray = list.toArray(); // converts list to array of Object
        String[] stringArray = list.toArray(new String[0]); // converts list to array of String type

        list.clear();
        System.out.println(objectArray.length);
        System.out.println(stringArray.length);
    }
}
