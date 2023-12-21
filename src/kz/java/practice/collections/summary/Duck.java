package kz.java.practice.collections.summary;

public class Duck implements Comparable<Duck> {
    String name;

    public Duck(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

//    @Override
    public int compareTo(Duck o) {
        return name.compareTo(o.name);
    }
}
