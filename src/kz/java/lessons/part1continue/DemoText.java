package kz.java.lessons.part1continue;

public class DemoText {
    public static void main(String[] args) {
        String hello = """
                "Java Study Guide"
                   by Scott & Jeanne """;
        System.out.println(hello);

        String eyeTest = "\"Java Study Guide\"\n   by Scott and Jeanne";
        System.out.println(eyeTest);

        String pyramid = """
                  *
                 * *
                * * *
                """;
        System.out.println(pyramid);
    }
}
