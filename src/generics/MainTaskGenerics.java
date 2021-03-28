package generics;

import interfaces.Flyable;

public class MainTaskGenerics {

    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("name1");
        Airplane airplane2 = new Airplane("name2");

        Duck duck1 = new Duck("name3");
        Duck duck2 = new Duck("name4");

        Airplane[] airplanes = {airplane1, airplane2};
        Duck[] ducks = {duck1, duck2};

        System.out.println(getElement(airplanes, airplane1));
        System.out.println(getElement(ducks, airplane1));
    }

    private static <T extends Flyable> T getElement(T[] objs, T obj) {
        for (T elem:objs) {
            if (elem.equals(obj))
                return obj;
        }
        return null;
    }
}
