package arrlink_lists_task;

import java.util.ArrayList;
import java.util.LinkedList;

public class arrlink_lists_task {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        for (int i=0; i<10; i++) {
            strings.add(i, "string_" + i);
        }
        System.out.println(strings);

        strings.add("string_last");
        strings.add(0, "string_first");
        System.out.println(strings);

        System.out.println(strings.get(5));

        LinkedList<Number> numbers = new LinkedList<>();

        for (int i=0; i<10; i++) {
            numbers.add(i, i+10);
        }
        System.out.println(numbers);

        LinkedList<String> strings1 = new LinkedList<>(strings);
        System.out.println(strings1);
        System.out.println(strings1.getLast());

        System.out.println(strings1.get(5));
        strings1.remove(5);
        System.out.println(strings1.get(5));

        strings1.clear();
        if (strings1.isEmpty()) {
            System.out.println("list is empty");
        }
    }
}
