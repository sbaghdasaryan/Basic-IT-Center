package speed_generics;

public class Duck implements Flyable, Swimable {
    private int speed;

    public Duck(int speed) {
        this.speed=speed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void fly() {
        System.out.println("Flies short distance");
    }

    @Override
    public void swim() {
        System.out.println("Swims on the water");
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Duck))
            return -2;

        Duck duck = (Duck) o;
        if (this.getSpeed() > duck.speed)
            return 1;
        if (this.getSpeed() < duck.speed)
            return -1;
        return 0;
    }
}
