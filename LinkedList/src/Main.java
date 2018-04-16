import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Person> list = new LinkedList<Person>();

        list.insert(new Person("Darron", 29));
        list.insert(new Person("Ade", 26));
        list.insert(new Person("Kevon", 29));

        list.traverseList();

    }
}
