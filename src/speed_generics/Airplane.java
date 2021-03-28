package speed_generics;

public class Airplane implements Flyable {
    private int speed;

    public Airplane(int speed){
        this.speed=speed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void fly() {
        System.out.println("Have wings but fly with the help of some engine");
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Airplane))
            return -2;

        Airplane airplane = (Airplane) o;

        if (this.getSpeed() > airplane.speed)
            return 1;
        if (this.getSpeed() < airplane.speed)
            return -1;
        return 0;
    }
}

