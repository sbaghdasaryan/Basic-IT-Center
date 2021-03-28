package speed_generics;

public class MainForGenerics {

    public static void main(String[] args) {
        System.out.println(compareToObjects(new Airplane(50),new Duck(20)));
        System.out.println(compareToObjects(new Airplane(450),new Airplane(500)));
        System.out.println(compareToObjects(new Duck(20),new Duck(20)));
        System.out.println(compareToObjects(new Duck(20),new Duck(15)));
    }

    private static <T extends Comparable<T>> int compareToObjects(T obj1, T obj2) {
        return obj1.compareTo(obj2);
    }
}