package kz.java.practice.string;

public class DemoEquals {
    public static void main(String[] args) {
        String name1 = "Jusan";
        String name2 = "Jusan";
        System.out.println(name2.equals(name1));
        System.out.println(name2 == name1);

        String word1 = new String("Jusan"); // создает объект на куче
        String word2  = new String("Jusan");
        System.out.println(word2 == word1); // сравниваем разные объекты и разные ссылки - оператор равно равно
        System.out.println(word2.equals(word1)); // содержимое одинаковое
    }
}
