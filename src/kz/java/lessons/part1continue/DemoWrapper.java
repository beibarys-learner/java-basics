package kz.java.lessons.part1continue;

import static java.lang.Integer.max;
import static java.lang.Integer.min;
import static java.lang.Integer.sum;

public class DemoWrapper {
    public static void main(String[] args) {
        // first way to create wrapper class
        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);

        // second way to convert String
        int value1 = Integer.parseInt("123"); // from String to int
        Integer value2 = Integer.valueOf("123"); // from String to Integer wrapper class
        System.out.println("value1 = " + value1);
        System.out.println("value2 = " + value2);

        // another one
        Double apple = Double.valueOf("200.99");
        System.out.println(apple.byteValue());
        System.out.println(apple.intValue());
        System.out.println(apple.doubleValue());

        Integer num1 = 100;
        Integer num2 = -99;
        System.out.println(max(num1, num2));
        System.out.println(min(num1, num2));
        System.out.println(sum(num1, num2));

    }
}
