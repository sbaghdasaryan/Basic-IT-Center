package generics;

import interfaces.Flyable;
import interfaces.Swimable;

public class Duck implements Flyable, Swimable {
    private String name;

    public Duck(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
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
    public boolean equals(Object anObject) {
        if (!(anObject instanceof Duck))
            return false;
        Duck param = (Duck) anObject;
        if (param.getName().equals(this.getName())) {
            return true;
        } else {
            return false;
        }
    }
}
