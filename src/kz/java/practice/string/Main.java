package kz.java.practice.string;

public class Main {
    public static void main(String[] args) {
        var name = "animals";
        String surname = "plants";
        System.out.println(name.length());
        System.out.println(surname.length());

        System.out.println(name.charAt(0));

        System.out.println(name.indexOf('a'));
        System.out.println(name.indexOf("al"));

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        System.out.println("abc".equals("ABC"));
        System.out.println("ABC".equals("ABC"));
        System.out.println("abc".equalsIgnoreCase("ABC"));
    }
}
