package kz.java.practice.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MethodDemo {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();

        countries.add("KZ");
        countries.add("RU");
        countries.add(2, "UZ");
        countries.set(0, "TJK");
        System.out.println(countries);

        System.out.println(countries.get(0));
        countries.remove("RU");
//        countries.remove(2);
//        countries.set(0, "ABC"); will give you IndexOutOfBoundsException

        var digits = Arrays.asList(1 , 2, 3, 4, 5);
        digits.replaceAll(i -> i*2);
        System.out.println(digits);

        var winners = new LinkedList<Integer>();
        winners.add(1);
        winners.add(2);
        winners.add(3);
        winners.remove(2);
        winners.remove(Integer.valueOf(2));
        System.out.println(winners);

    }
}
