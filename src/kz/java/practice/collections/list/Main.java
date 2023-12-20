package kz.java.practice.collections.list;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] array = new String[] {"a", "b", "c"};

        var strings = new ArrayList<>(); // the type of var is ArrayList<Object>
        strings.add("a");
        strings.add("b");
        strings.add("a");
        for (Object s: strings){
            System.out.print(s); // Java assumes its generic option
        }

        var letters = new ArrayList<String>();
        letters.add("c");
        letters.add("d");
        letters.add("e");
        for (String a: letters){
//            System.out.println(a);
        }
    }
}
